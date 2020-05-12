package org.hl7.fhir.dstu3.elementmodel;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
    
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
 */



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.hl7.fhir.dstu3.context.IWorkerContext;
import org.hl7.fhir.dstu3.formats.FormatUtilities;
import org.hl7.fhir.dstu3.formats.IParser.OutputStyle;
import org.hl7.fhir.dstu3.model.StructureDefinition;
import org.hl7.fhir.dstu3.utils.ToolingExtensions;
import org.hl7.fhir.exceptions.DefinitionException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.validation.ValidationMessage;
import org.hl7.fhir.utilities.validation.ValidationMessage.IssueSeverity;
import org.hl7.fhir.utilities.validation.ValidationMessage.IssueType;
import org.hl7.fhir.utilities.validation.ValidationMessage.Source;

public abstract class ParserBase {

  public interface ILinkResolver {
    String resolveType(String type);
    String resolveProperty(Property property);
    String resolvePage(String string);
  }
  
  public enum ValidationPolicy { NONE, QUICK, EVERYTHING }

  public boolean isPrimitive(String code) {
    return Utilities.existsInList(code, "boolean", "integer", "string", "decimal", "uri", "base64Binary", "instant", "date", "dateTime", "time", "code", "oid", "id", "markdown", "unsignedInt", "positiveInt", "xhtml");
    
//    StructureDefinition sd = context.fetchTypeDefinition(code);
//    return sd != null && sd.getKind() == StructureDefinitionKind.PRIMITIVETYPE;
	}

	protected IWorkerContext context;
	protected ValidationPolicy policy;
  protected List<ValidationMessage> errors;
  protected ILinkResolver linkResolver;

	public ParserBase(IWorkerContext context) {
		super();
		this.context = context;
		policy = ValidationPolicy.NONE;
	}

	public void setupValidation(ValidationPolicy policy, List<ValidationMessage> errors) {
	  this.policy = policy;
	  this.errors = errors;
	}

  public abstract Element parse(InputStream stream) throws IOException, FHIRFormatError, DefinitionException, FHIRException;

	public abstract void compose(Element e, OutputStream destination, OutputStyle style, String base)  throws FHIRException, IOException;

	
	public void logError(int line, int col, String path, IssueType type, String message, IssueSeverity level) throws FHIRFormatError {
	  if (policy == ValidationPolicy.EVERYTHING) {
	    ValidationMessage msg = new ValidationMessage(Source.InstanceValidator, type, line, col, path, message, level);
	    errors.add(msg);
	  } else if (level == IssueSeverity.FATAL || (level == IssueSeverity.ERROR && policy == ValidationPolicy.QUICK))
	    throw new FHIRFormatError(message+String.format(" at line %d col %d", line, col));
	}
	
	
	protected StructureDefinition getDefinition(int line, int col, String ns, String name) throws FHIRFormatError {
    if (ns == null) {
      logError(line, col, name, IssueType.STRUCTURE, "This cannot be parsed as a FHIR object (no namespace)", IssueSeverity.FATAL);
      return null;
    }
    if (name == null) {
      logError(line, col, name, IssueType.STRUCTURE, "This cannot be parsed as a FHIR object (no name)", IssueSeverity.FATAL);
      return null;
  	}
	  for (StructureDefinition sd : context.allStructures()) {
	    if (name.equals(sd.getIdElement().getIdPart())) {
	      if((ns == null || ns.equals(FormatUtilities.FHIR_NS)) && !ToolingExtensions.hasExtension(sd, "http://hl7.org/fhir/StructureDefinition/elementdefinition-namespace"))
	        return sd;
	      String sns = ToolingExtensions.readStringExtension(sd, "http://hl7.org/fhir/StructureDefinition/elementdefinition-namespace");
	      if (ns != null && ns.equals(sns))
	        return sd;
	    }
	  }
	  logError(line, col, name, IssueType.STRUCTURE, "This does not appear to be a FHIR resource (unknown namespace/name '"+ns+"::"+name+"')", IssueSeverity.FATAL);
	  return null;
  }

	protected StructureDefinition getDefinition(int line, int col, String name) throws FHIRFormatError {
    if (name == null) {
      logError(line, col, name, IssueType.STRUCTURE, "This cannot be parsed as a FHIR object (no name)", IssueSeverity.FATAL);
      return null;
  	}
    // first pass: only look at base definitions
	  for (StructureDefinition sd : context.allStructures()) {
	    if (sd.getUrl().equals("http://hl7.org/fhir/StructureDefinition/"+name)) {
	      return sd;
	    }
	  }
    for (StructureDefinition sd : context.allStructures()) {
      if (name.equals(sd.getIdElement().getIdPart())) {
        return sd;
      }
    }
	  logError(line, col, name, IssueType.STRUCTURE, "This does not appear to be a FHIR resource (unknown name '"+name+"')", IssueSeverity.FATAL);
	  return null;
  }

  public ILinkResolver getLinkResolver() {
    return linkResolver;
  }

  public ParserBase setLinkResolver(ILinkResolver linkResolver) {
    this.linkResolver = linkResolver;
    return this;
  }



  
}