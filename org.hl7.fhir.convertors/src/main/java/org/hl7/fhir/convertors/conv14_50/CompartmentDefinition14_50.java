package org.hl7.fhir.convertors.conv14_50;

import org.hl7.fhir.convertors.VersionConvertor_14_50;
import org.hl7.fhir.exceptions.FHIRException;

public class CompartmentDefinition14_50 {

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.r5.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition();
        VersionConvertor_14_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement(VersionConvertor_14_50.convertUri(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_14_50.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatusElement(VersionConvertor_14_50.convertConformanceResourceStatus(src.getStatusElement()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_50.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasPurpose())
            tgt.setRequirements(src.getPurpose());
        if (src.hasCode())
            tgt.setCodeElement(convertCompartmentType(src.getCodeElement()));
        if (src.hasSearchElement())
            tgt.setSearchElement(VersionConvertor_14_50.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu2016may.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.CompartmentDefinition tgt = new org.hl7.fhir.r5.model.CompartmentDefinition();
        VersionConvertor_14_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement(VersionConvertor_14_50.convertUri(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_14_50.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatusElement(VersionConvertor_14_50.convertConformanceResourceStatus(src.getStatusElement()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_50.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasRequirements())
            tgt.setPurpose(src.getRequirements());
        if (src.hasCode())
            tgt.setCodeElement(convertCompartmentType(src.getCodeElement()));
        if (src.hasSearchElement())
            tgt.setSearchElement(VersionConvertor_14_50.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent convertCompartmentDefinitionContactComponent(org.hl7.fhir.r5.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent();
        VersionConvertor_14_50.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_50.convertString(src.getNameElement()));
        for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_50.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ContactDetail convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ContactDetail tgt = new org.hl7.fhir.r5.model.ContactDetail();
        VersionConvertor_14_50.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_50.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_50.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_50.copyElement(src, tgt);
        if (src.hasCode()) {
            if (src.hasCodeElement())
                tgt.setCodeElement(VersionConvertor_14_50.convertCode(src.getCodeElement()));
        }
        for (org.hl7.fhir.r5.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_14_50.convertString(src.getDocumentationElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.r5.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_50.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_50.convertCode(src.getCodeElement()));
        for (org.hl7.fhir.dstu2016may.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_14_50.convertString(src.getDocumentationElement()));
        return tgt;
    }

    static public org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.CompartmentType> convertCompartmentType(org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.CompartmentType> tgt = new org.hl7.fhir.r5.model.Enumeration<>(new org.hl7.fhir.r5.model.Enumerations.CompartmentTypeEnumFactory());
        VersionConvertor_14_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case PATIENT:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.PATIENT);
                break;
            case ENCOUNTER:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.ENCOUNTER);
                break;
            case RELATEDPERSON:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.RELATEDPERSON);
                break;
            case PRACTITIONER:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.PRACTITIONER);
                break;
            case DEVICE:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.DEVICE);
                break;
            default:
                tgt.setValue(org.hl7.fhir.r5.model.Enumerations.CompartmentType.NULL);
                break;
        }
        return tgt;
    }

    static public org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType> convertCompartmentType(org.hl7.fhir.r5.model.Enumeration<org.hl7.fhir.r5.model.Enumerations.CompartmentType> src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.Enumeration<org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType> tgt = new org.hl7.fhir.dstu2016may.model.Enumeration<>(new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentTypeEnumFactory());
        VersionConvertor_14_50.copyElement(src, tgt);
        switch(src.getValue()) {
            case PATIENT:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PATIENT);
                break;
            case ENCOUNTER:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.ENCOUNTER);
                break;
            case RELATEDPERSON:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.RELATEDPERSON);
                break;
            case PRACTITIONER:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PRACTITIONER);
                break;
            case DEVICE:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.DEVICE);
                break;
            default:
                tgt.setValue(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.NULL);
                break;
        }
        return tgt;
    }
}