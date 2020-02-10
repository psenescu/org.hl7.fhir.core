package org.hl7.fhir.convertors.conv14_40;

import org.hl7.fhir.convertors.VersionConvertorConstants;
import org.hl7.fhir.convertors.VersionConvertor_14_40;
import org.hl7.fhir.dstu2016may.model.StringType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Type;
import java.util.Collections;

public class OperationDefinition14_40 {

    public static org.hl7.fhir.r4.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu2016may.model.OperationDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.OperationDefinition tgt = new org.hl7.fhir.r4.model.OperationDefinition();
        VersionConvertor_14_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r4.model.UriType) VersionConvertor_14_40.convertType(src.getUrlElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_14_40.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasKind()) {
            tgt.setKind(convertOperationKind(src.getKind()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_14_40.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.r4.model.DateTimeType) VersionConvertor_14_40.convertType(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact()) tgt.addContact(convertOperationDefinitionContactComponent(t));
        }
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_14_40.isJurisdiction(t))
            tgt.addJurisdiction(VersionConvertor_14_40.convertCodeableConcept(t));
        else
            tgt.addUseContext(VersionConvertor_14_40.convertCodeableConceptToUsageContext(t));
        if (src.hasRequirements())
            tgt.setPurpose(src.getRequirements());
        if (src.hasIdempotent())
            tgt.setAffectsState(!src.getIdempotent());
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.r4.model.CodeType) VersionConvertor_14_40.convertType(src.getCodeElement()));
        if (src.hasComment())
            tgt.setComment(src.getComment());
        if (src.hasBase()) {
            tgt.setBaseElement(VersionConvertor_14_40.convertReferenceToCanonical(src.getBase()));
        }
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_14_40.convertType(src.getSystemElement()));
        if (src.hasType()) {
            for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getType()) tgt.addResource(t.getValue());
        }
        tgt.setType(tgt.hasResource());
        if (src.hasInstanceElement())
            tgt.setInstanceElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_14_40.convertType(src.getInstanceElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter()) tgt.addParameter(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.r4.model.OperationDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.OperationDefinition tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition();
        VersionConvertor_14_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu2016may.model.UriType) VersionConvertor_14_40.convertType(src.getUrlElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_14_40.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasKind()) {
            tgt.setKind(convertOperationKind(src.getKind()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.dstu2016may.model.BooleanType) VersionConvertor_14_40.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.dstu2016may.model.DateTimeType) VersionConvertor_14_40.convertType(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact()) tgt.addContact(convertOperationDefinitionContactComponent(t));
        }
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getDescriptionElement()));
        for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext()) if (t.hasValueCodeableConcept())
            tgt.addUseContext(VersionConvertor_14_40.convertCodeableConcept(t.getValueCodeableConcept()));
        if (src.hasJurisdiction()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getJurisdiction()) tgt.addUseContext(VersionConvertor_14_40.convertCodeableConcept(t));
        }
        if (src.hasPurpose())
            tgt.setRequirements(src.getPurpose());
        if (src.hasAffectsState())
            tgt.setIdempotent(!src.getAffectsState());
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.dstu2016may.model.CodeType) VersionConvertor_14_40.convertType(src.getCodeElement()));
        if (src.hasCommentElement())
            tgt.setCommentElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getCommentElement()));
        if (src.hasBaseElement()) {
            tgt.setBase(VersionConvertor_14_40.convertCanonicalToReference(src.getBaseElement()));
        }
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.dstu2016may.model.BooleanType) VersionConvertor_14_40.convertType(src.getSystemElement()));
        if (src.getType())
            if (src.hasResource()) {
                for (org.hl7.fhir.r4.model.CodeType t : src.getResource()) tgt.addType(t.getValue());
            }
        if (src.hasInstanceElement())
            tgt.setInstanceElement((org.hl7.fhir.dstu2016may.model.BooleanType) VersionConvertor_14_40.convertType(src.getInstanceElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter()) tgt.addParameter(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.r4.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ContactDetail convertOperationDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.ContactDetail tgt = new org.hl7.fhir.r4.model.ContactDetail();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        tgt.setStrength(VersionConvertor_14_40.convertBindingStrength(src.getStrength()));
        Type t = VersionConvertor_14_40.convertType(src.getValueSet());
        if (t != null) {
            if (t instanceof org.hl7.fhir.r4.model.Reference)
                tgt.setValueSet(((org.hl7.fhir.r4.model.Reference) t).getReference());
            else
                tgt.setValueSet(t.primitiveValue());
            tgt.setValueSet(VersionConvertorConstants.refToVS(tgt.getValueSet()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        tgt.setStrength(VersionConvertor_14_40.convertBindingStrength(src.getStrength()));
        if (src.hasValueSet()) {
            String vsr = VersionConvertorConstants.vsToRef(src.getValueSet());
            if (vsr != null)
                tgt.setValueSet(new org.hl7.fhir.dstu2016may.model.UriType(vsr));
            else
                tgt.setValueSet(new org.hl7.fhir.dstu2016may.model.Reference(src.getValueSet()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r4.model.CodeType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasUse()) {
            tgt.setUse(convertOperationParameterUse(src.getUse()));
        }
        if (src.hasMinElement())
            tgt.setMinElement((org.hl7.fhir.r4.model.IntegerType) VersionConvertor_14_40.convertType(src.getMinElement()));
        if (src.hasMaxElement())
            tgt.setMaxElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getMaxElement()));
        if (src.hasDocumentationElement())
            tgt.setDocumentationElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getDocumentationElement()));
        if (src.hasTypeElement())
            tgt.setTypeElement((org.hl7.fhir.r4.model.CodeType) VersionConvertor_14_40.convertType(src.getTypeElement()));
        if (src.hasSearchType()) {
            tgt.setSearchType(VersionConvertor_14_40.convertSearchParamType(src.getSearchType()));
        }
        if (src.hasProfile()) {
            tgt.addTargetProfile(src.getProfile().getReference());
        }
        if (src.hasBinding()) {
            tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
        }
        if (src.hasPart()) {
            for (org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart()) tgt.addPart(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationDefinitionParameterComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2016may.model.CodeType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasUse()) {
            tgt.setUse(convertOperationParameterUse(src.getUse()));
        }
        if (src.hasMinElement())
            tgt.setMinElement((org.hl7.fhir.dstu2016may.model.IntegerType) VersionConvertor_14_40.convertType(src.getMinElement()));
        if (src.hasMaxElement())
            tgt.setMaxElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getMaxElement()));
        if (src.hasDocumentationElement())
            tgt.setDocumentationElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getDocumentationElement()));
        if (src.hasTypeElement())
            tgt.setTypeElement((org.hl7.fhir.dstu2016may.model.CodeType) VersionConvertor_14_40.convertType(src.getTypeElement()));
        if (src.hasSearchType()) {
            tgt.setSearchType(VersionConvertor_14_40.convertSearchParamType(src.getSearchType()));
        }
        if (src.hasTargetProfile()) {
            for (org.hl7.fhir.r4.model.UriType t : src.getTargetProfile()) tgt.setProfile(new org.hl7.fhir.dstu2016may.model.Reference(t.getValue()));
        }
        if (src.hasBinding()) {
            tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
        }
        if (src.hasPart()) {
            for (org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart()) tgt.addPart(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    static public org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.r4.model.OperationDefinition.OperationKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OPERATION:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.OPERATION;
            case QUERY:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.QUERY;
            default:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OPERATION:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationKind.OPERATION;
            case QUERY:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationKind.QUERY;
            default:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationKind.NULL;
        }
    }

    static public org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case IN:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.IN;
            case OUT:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.OUT;
            default:
                return org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu2016may.model.OperationDefinition.OperationParameterUse src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case IN:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse.IN;
            case OUT:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse.OUT;
            default:
                return org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse.NULL;
        }
    }
}
