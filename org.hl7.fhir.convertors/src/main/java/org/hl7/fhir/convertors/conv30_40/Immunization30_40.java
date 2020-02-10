package org.hl7.fhir.convertors.conv30_40;

import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;

public class Immunization30_40 {

    public static org.hl7.fhir.r4.model.Immunization convertImmunization(org.hl7.fhir.dstu3.model.Immunization src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Immunization tgt = new org.hl7.fhir.r4.model.Immunization();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        }
        if (src.hasStatus())
            tgt.setStatus(convertImmunizationStatus(src.getStatus()));
        if (src.hasVaccineCode())
            tgt.setVaccineCode(VersionConvertor_30_40.convertCodeableConcept(src.getVaccineCode()));
        if (src.hasPatient())
            tgt.setPatient(VersionConvertor_30_40.convertReference(src.getPatient()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_30_40.convertReference(src.getEncounter()));
        if (src.hasDateElement())
            tgt.setOccurrence(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPrimarySourceElement())
            tgt.setPrimarySourceElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_30_40.convertType(src.getPrimarySourceElement()));
        if (src.hasReportOrigin())
            tgt.setReportOrigin(VersionConvertor_30_40.convertCodeableConcept(src.getReportOrigin()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_40.convertReference(src.getLocation()));
        if (src.hasManufacturer())
            tgt.setManufacturer(VersionConvertor_30_40.convertReference(src.getManufacturer()));
        if (src.hasLotNumberElement())
            tgt.setLotNumberElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_30_40.convertType(src.getLotNumberElement()));
        if (src.hasExpirationDate())
          tgt.setExpirationDateElement(VersionConvertor_30_40.convertDate(src.getExpirationDateElement()));
        if (src.hasSite())
            tgt.setSite(VersionConvertor_30_40.convertCodeableConcept(src.getSite()));
        if (src.hasRoute())
            tgt.setRoute(VersionConvertor_30_40.convertCodeableConcept(src.getRoute()));
        if (src.hasDoseQuantity())
            tgt.setDoseQuantity(VersionConvertor_30_40.convertSimpleQuantity(src.getDoseQuantity()));
        if (src.hasPractitioner()) {
            for (org.hl7.fhir.dstu3.model.Immunization.ImmunizationPractitionerComponent t : src.getPractitioner()) tgt.addPerformer(convertImmunizationPractitionerComponent(t));
        }
        if (src.hasNote()) {
            for (org.hl7.fhir.dstu3.model.Annotation t : src.getNote()) tgt.addNote(VersionConvertor_30_40.convertAnnotation(t));
        }
        if (src.hasExplanation()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getExplanation().getReason()) tgt.addReasonCode(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Immunization convertImmunization(org.hl7.fhir.r4.model.Immunization src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Immunization tgt = new org.hl7.fhir.dstu3.model.Immunization();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_30_40.convertIdentifier(t));
        }
        if (src.hasStatus())
            tgt.setStatus(convertImmunizationStatus(src.getStatus()));
        if (src.hasVaccineCode())
            tgt.setVaccineCode(VersionConvertor_30_40.convertCodeableConcept(src.getVaccineCode()));
        if (src.hasPatient())
            tgt.setPatient(VersionConvertor_30_40.convertReference(src.getPatient()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_30_40.convertReference(src.getEncounter()));
        if (src.hasOccurrenceDateTimeType())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getOccurrenceDateTimeType()));
        if (src.hasPrimarySourceElement())
            tgt.setPrimarySourceElement((org.hl7.fhir.dstu3.model.BooleanType) VersionConvertor_30_40.convertType(src.getPrimarySourceElement()));
        if (src.hasReportOrigin())
            tgt.setReportOrigin(VersionConvertor_30_40.convertCodeableConcept(src.getReportOrigin()));
        if (src.hasLocation())
            tgt.setLocation(VersionConvertor_30_40.convertReference(src.getLocation()));
        if (src.hasManufacturer())
            tgt.setManufacturer(VersionConvertor_30_40.convertReference(src.getManufacturer()));
        if (src.hasLotNumberElement())
            tgt.setLotNumberElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_30_40.convertType(src.getLotNumberElement()));
        if (src.hasExpirationDate())
          tgt.setExpirationDateElement(VersionConvertor_30_40.convertDate(src.getExpirationDateElement()));
        if (src.hasSite())
            tgt.setSite(VersionConvertor_30_40.convertCodeableConcept(src.getSite()));
        if (src.hasRoute())
            tgt.setRoute(VersionConvertor_30_40.convertCodeableConcept(src.getRoute()));
        if (src.hasDoseQuantity())
            tgt.setDoseQuantity(VersionConvertor_30_40.convertSimpleQuantity(src.getDoseQuantity()));
        if (src.hasPerformer()) {
            for (org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent t : src.getPerformer()) tgt.addPractitioner(convertImmunizationPractitionerComponent(t));
        }
        if (src.hasNote()) {
            for (org.hl7.fhir.r4.model.Annotation t : src.getNote()) tgt.addNote(VersionConvertor_30_40.convertAnnotation(t));
        }
        if (src.hasReasonCode()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getReasonCode()) tgt.getExplanation().addReason(VersionConvertor_30_40.convertCodeableConcept(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Immunization.ImmunizationPractitionerComponent convertImmunizationPractitionerComponent(org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Immunization.ImmunizationPractitionerComponent tgt = new org.hl7.fhir.dstu3.model.Immunization.ImmunizationPractitionerComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasFunction())
            tgt.setRole(VersionConvertor_30_40.convertCodeableConcept(src.getFunction()));
        if (src.hasActor())
            tgt.setActor(VersionConvertor_30_40.convertReference(src.getActor()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent convertImmunizationPractitionerComponent(org.hl7.fhir.dstu3.model.Immunization.ImmunizationPractitionerComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent tgt = new org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasRole())
            tgt.setFunction(VersionConvertor_30_40.convertCodeableConcept(src.getRole()));
        if (src.hasActor())
            tgt.setActor(VersionConvertor_30_40.convertReference(src.getActor()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.Immunization.ImmunizationStatus convertImmunizationStatus(org.hl7.fhir.r4.model.Immunization.ImmunizationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case COMPLETED:
                return org.hl7.fhir.dstu3.model.Immunization.ImmunizationStatus.COMPLETED;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu3.model.Immunization.ImmunizationStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.dstu3.model.Immunization.ImmunizationStatus.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.Immunization.ImmunizationStatus convertImmunizationStatus(org.hl7.fhir.dstu3.model.Immunization.ImmunizationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case COMPLETED:
                return org.hl7.fhir.r4.model.Immunization.ImmunizationStatus.COMPLETED;
            case ENTEREDINERROR:
                return org.hl7.fhir.r4.model.Immunization.ImmunizationStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.r4.model.Immunization.ImmunizationStatus.NULL;
        }
    }
}
