package org.hl7.fhir.convertors.conv30_40;

import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.dstu3.model.ContactDetail;
import org.hl7.fhir.dstu3.model.Contributor.ContributorType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.CodeType;
import org.hl7.fhir.r4.model.StringType;

import java.util.Collections;

public class ActivityDefinition30_40 {

    public static org.hl7.fhir.dstu3.model.ActivityDefinition convertActivityDefinition(org.hl7.fhir.r4.model.ActivityDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu3.model.UriType) VersionConvertor_30_40.convertType(src.getUrlElement()));
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        }
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getNameElement()));
        if (src.hasTitleElement())
            tgt.setTitleElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.dstu3.model.BooleanType) VersionConvertor_30_40.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getPublisherElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu3.model.MarkdownType) VersionConvertor_30_40.convertType(src.getDescriptionElement()));
        if (src.hasPurposeElement())
            tgt.setPurposeElement((org.hl7.fhir.dstu3.model.MarkdownType) VersionConvertor_30_40.convertType(src.getPurposeElement()));
        if (src.hasUsageElement())
            tgt.setUsageElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getUsageElement()));
        if (src.hasApprovalDate())
          tgt.setApprovalDateElement(VersionConvertor_30_40.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
          tgt.setLastReviewDateElement(VersionConvertor_30_40.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_40.convertPeriod(src.getEffectivePeriod()));
        if (src.hasUseContext()) {
            for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        }
        if (src.hasJurisdiction()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        if (src.hasTopic()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getTopic()) tgt.addTopic(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getAuthor()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.AUTHOR);
            c.addContact(VersionConvertor_30_40.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getEditor()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.EDITOR);
            c.addContact(VersionConvertor_30_40.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getReviewer()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.REVIEWER);
            c.addContact(VersionConvertor_30_40.convertContactDetail(t));
            tgt.addContributor(c);
        }
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getEndorser()) {
            org.hl7.fhir.dstu3.model.Contributor c = new org.hl7.fhir.dstu3.model.Contributor();
            c.setType(ContributorType.ENDORSER);
            c.addContact(VersionConvertor_30_40.convertContactDetail(t));
            tgt.addContributor(c);
        }
        if (src.hasContact()) {
            for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        }
        if (src.hasCopyrightElement())
            tgt.setCopyrightElement((org.hl7.fhir.dstu3.model.MarkdownType) VersionConvertor_30_40.convertType(src.getCopyrightElement()));
        if (src.hasRelatedArtifact()) {
            for (org.hl7.fhir.r4.model.RelatedArtifact t : src.getRelatedArtifact()) tgt.addRelatedArtifact(VersionConvertor_30_40.convertRelatedArtifact(t));
        }
        if (src.hasLibrary()) {
            for (org.hl7.fhir.r4.model.CanonicalType t : src.getLibrary()) tgt.addLibrary(VersionConvertor_30_40.convertCanonicalToReference(t));
        }
        if (src.hasKind())
            tgt.setKind(convertActivityDefinitionKind(src.getKind()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_40.convertCodeableConcept(src.getCode()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_30_40.convertType(src.getTiming()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_40.convertReference(src.getLocation()));
        if (src.hasParticipant()) {
            for (org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertActivityDefinitionParticipantComponent(t));
        }
        if (src.hasProduct())
            tgt.setProduct(VersionConvertor_30_40.convertType(src.getProduct()));
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_30_40.convertSimpleQuantity(src.getQuantity()));
        if (src.hasDosage()) {
            for (org.hl7.fhir.r4.model.Dosage t : src.getDosage()) tgt.addDosage(VersionConvertor_30_40.convertDosage(t));
        }
        if (src.hasBodySite()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        if (src.hasTransform())
            tgt.setTransform(VersionConvertor_30_40.convertCanonicalToReference(src.getTransformElement()));
        if (src.hasDynamicValue()) {
            for (org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent t : src.getDynamicValue()) tgt.addDynamicValue(convertActivityDefinitionDynamicValueComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ActivityDefinition convertActivityDefinition(org.hl7.fhir.dstu3.model.ActivityDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.ActivityDefinition tgt = new org.hl7.fhir.r4.model.ActivityDefinition();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r4.model.UriType) VersionConvertor_30_40.convertType(src.getUrlElement()));
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        }
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getNameElement()));
        if (src.hasTitleElement())
            tgt.setTitleElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_30_40.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getPublisherElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.r4.model.MarkdownType) VersionConvertor_30_40.convertType(src.getDescriptionElement()));
        if (src.hasPurposeElement())
            tgt.setPurposeElement((org.hl7.fhir.r4.model.MarkdownType) VersionConvertor_30_40.convertType(src.getPurposeElement()));
        if (src.hasUsageElement())
            tgt.setUsageElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getUsageElement()));
        if (src.hasApprovalDate())
          tgt.setApprovalDateElement(VersionConvertor_30_40.convertDate(src.getApprovalDateElement()));
        if (src.hasLastReviewDate())
          tgt.setLastReviewDateElement(VersionConvertor_30_40.convertDate(src.getLastReviewDateElement()));
        if (src.hasEffectivePeriod())
            tgt.setEffectivePeriod(VersionConvertor_30_40.convertPeriod(src.getEffectivePeriod()));
        if (src.hasUseContext()) {
            for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        }
        if (src.hasJurisdiction()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        if (src.hasTopic()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getTopic()) tgt.addTopic(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        for (org.hl7.fhir.dstu3.model.Contributor t : src.getContributor()) {
            if (t.getType() == ContributorType.AUTHOR)
                for (ContactDetail c : t.getContact()) tgt.addAuthor(VersionConvertor_30_40.convertContactDetail(c));
            if (t.getType() == ContributorType.EDITOR)
                for (ContactDetail c : t.getContact()) tgt.addEditor(VersionConvertor_30_40.convertContactDetail(c));
            if (t.getType() == ContributorType.REVIEWER)
                for (ContactDetail c : t.getContact()) tgt.addReviewer(VersionConvertor_30_40.convertContactDetail(c));
            if (t.getType() == ContributorType.ENDORSER)
                for (ContactDetail c : t.getContact()) tgt.addEndorser(VersionConvertor_30_40.convertContactDetail(c));
        }
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        }
        if (src.hasCopyrightElement())
            tgt.setCopyrightElement((org.hl7.fhir.r4.model.MarkdownType) VersionConvertor_30_40.convertType(src.getCopyrightElement()));
        if (src.hasRelatedArtifact()) {
            for (org.hl7.fhir.dstu3.model.RelatedArtifact t : src.getRelatedArtifact()) tgt.addRelatedArtifact(VersionConvertor_30_40.convertRelatedArtifact(t));
        }
        if (src.hasLibrary()) {
            for (org.hl7.fhir.dstu3.model.Reference t : src.getLibrary()) tgt.getLibrary().add(VersionConvertor_30_40.convertReferenceToCanonical(t));
        }
        if (src.hasKind())
            tgt.setKind(convertActivityDefinitionKind(src.getKind()));
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_40.convertCodeableConcept(src.getCode()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_30_40.convertType(src.getTiming()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_40.convertReference(src.getLocation()));
        if (src.hasParticipant()) {
            for (org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertActivityDefinitionParticipantComponent(t));
        }
        if (src.hasProduct())
            tgt.setProduct(VersionConvertor_30_40.convertType(src.getProduct()));
        if (src.hasQuantity())
            tgt.setQuantity(VersionConvertor_30_40.convertSimpleQuantity(src.getQuantity()));
        if (src.hasDosage()) {
            for (org.hl7.fhir.dstu3.model.Dosage t : src.getDosage()) tgt.addDosage(VersionConvertor_30_40.convertDosage(t));
        }
        if (src.hasBodySite()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getBodySite()) tgt.addBodySite(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        if (src.hasTransform())
            tgt.setTransformElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getTransform()));
        if (src.hasDynamicValue()) {
            for (org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent t : src.getDynamicValue()) tgt.addDynamicValue(convertActivityDefinitionDynamicValueComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent convertActivityDefinitionDynamicValueComponent(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent tgt = new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasDescriptionElement())
          tgt.getExpression().setDescriptionElement((StringType) VersionConvertor_30_40.convertType(src.getDescriptionElement()));
        if (src.hasPathElement())
            tgt.setPathElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getPathElement()));
        if (src.hasLanguageElement())
            tgt.getExpression().setLanguageElement((CodeType) VersionConvertor_30_40.convertType(src.getLanguageElement()));
        if (src.hasExpressionElement())
            tgt.getExpression().setExpressionElement((StringType) VersionConvertor_30_40.convertType(src.getExpressionElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent convertActivityDefinitionDynamicValueComponent(org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasPathElement())
            tgt.setPathElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getPathElement()));
        if (src.getExpression().hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getExpression().getDescriptionElement()));
        if (src.getExpression().hasLanguageElement())
            tgt.setLanguageElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getExpression().getLanguageElement()));
        if (src.getExpression().hasExpressionElement())
            tgt.setExpressionElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getExpression().getExpressionElement()));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind convertActivityDefinitionKind(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case APPOINTMENT:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENT;
            case APPOINTMENTRESPONSE:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENTRESPONSE;
            case CAREPLAN:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.CAREPLAN;
            case CLAIM:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.CLAIM;
            case COMMUNICATIONREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.COMMUNICATIONREQUEST;
            case CONTRACT:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.CONTRACT;
            case DEVICEREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.DEVICEREQUEST;
            case ENROLLMENTREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.ENROLLMENTREQUEST;
            case IMMUNIZATIONRECOMMENDATION:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.IMMUNIZATIONRECOMMENDATION;
            case MEDICATIONREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.MEDICATIONREQUEST;
            case NUTRITIONORDER:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.NUTRITIONORDER;
            case PROCEDUREREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.SERVICEREQUEST;
            case REFERRALREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.SERVICEREQUEST;
            case SUPPLYREQUEST:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.SUPPLYREQUEST;
            case TASK:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.TASK;
            case VISIONPRESCRIPTION:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.VISIONPRESCRIPTION;
            default:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind convertActivityDefinitionKind(org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case APPOINTMENT:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENT;
            case APPOINTMENTRESPONSE:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.APPOINTMENTRESPONSE;
            case CAREPLAN:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CAREPLAN;
            case CLAIM:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CLAIM;
            case COMMUNICATIONREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.COMMUNICATIONREQUEST;
            case CONTRACT:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.CONTRACT;
            case DEVICEREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.DEVICEREQUEST;
            case ENROLLMENTREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.ENROLLMENTREQUEST;
            case IMMUNIZATIONRECOMMENDATION:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.IMMUNIZATIONRECOMMENDATION;
            case MEDICATIONREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.MEDICATIONREQUEST;
            case NUTRITIONORDER:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.NUTRITIONORDER;
            case SERVICEREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.PROCEDUREREQUEST;
            case SUPPLYREQUEST:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.SUPPLYREQUEST;
            case TASK:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.TASK;
            case VISIONPRESCRIPTION:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.VISIONPRESCRIPTION;
            default:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionKind.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent convertActivityDefinitionParticipantComponent(org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent tgt = new org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertActivityParticipantType(src.getType()));
        if (src.hasRole())
            tgt.setRole(VersionConvertor_30_40.convertCodeableConcept(src.getRole()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent convertActivityDefinitionParticipantComponent(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityDefinitionParticipantComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent tgt = new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertActivityParticipantType(src.getType()));
        if (src.hasRole())
            tgt.setRole(VersionConvertor_30_40.convertCodeableConcept(src.getRole()));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType convertActivityParticipantType(org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType.PATIENT;
            case PRACTITIONER:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType.PRACTITIONER;
            case RELATEDPERSON:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType.RELATEDPERSON;
            default:
                return org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType convertActivityParticipantType(org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.PATIENT;
            case PRACTITIONER:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.PRACTITIONER;
            case RELATEDPERSON:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.RELATEDPERSON;
            default:
                return org.hl7.fhir.dstu3.model.ActivityDefinition.ActivityParticipantType.NULL;
        }
    }
}
