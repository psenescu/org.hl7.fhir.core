package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;

public class Substance10_40 {

    public static org.hl7.fhir.r4.model.Substance convertSubstance(org.hl7.fhir.dstu2.model.Substance src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Substance tgt = new org.hl7.fhir.r4.model.Substance();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        }
        if (src.hasCategory()) {
            for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getCategory()) tgt.addCategory(VersionConvertor_10_40.convertCodeableConcept(t));
        }
        if (src.hasCode()) {
            tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        }
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_10_40.convertType(src.getDescriptionElement()));
        if (src.hasInstance()) {
            for (org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent t : src.getInstance()) tgt.addInstance(convertSubstanceInstanceComponent(t));
        }
        if (src.hasIngredient()) {
            for (org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertSubstanceIngredientComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance convertSubstance(org.hl7.fhir.r4.model.Substance src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Substance tgt = new org.hl7.fhir.dstu2.model.Substance();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        }
        if (src.hasCategory()) {
            for (org.hl7.fhir.r4.model.CodeableConcept t : src.getCategory()) tgt.addCategory(VersionConvertor_10_40.convertCodeableConcept(t));
        }
        if (src.hasCode()) {
            tgt.setCode(VersionConvertor_10_40.convertCodeableConcept(src.getCode()));
        }
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_40.convertType(src.getDescriptionElement()));
        if (src.hasInstance()) {
            for (org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent t : src.getInstance()) tgt.addInstance(convertSubstanceInstanceComponent(t));
        }
        if (src.hasIngredient()) {
            for (org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertSubstanceIngredientComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasQuantity()) {
            tgt.setQuantity(VersionConvertor_10_40.convertRatio(src.getQuantity()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent convertSubstanceIngredientComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceIngredientComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent tgt = new org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasQuantity()) {
            tgt.setQuantity(VersionConvertor_10_40.convertRatio(src.getQuantity()));
        }
        if (src.hasSubstance()) {
            tgt.setSubstance(VersionConvertor_10_40.convertReference(src.getSubstance()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent convertSubstanceInstanceComponent(org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent tgt = new org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasExpiryElement())
            tgt.setExpiryElement((org.hl7.fhir.r4.model.DateTimeType) VersionConvertor_10_40.convertType(src.getExpiryElement()));
        if (src.hasQuantity()) {
            tgt.setQuantity(VersionConvertor_10_40.convertSimpleQuantity(src.getQuantity()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent convertSubstanceInstanceComponent(org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent tgt = new org.hl7.fhir.dstu2.model.Substance.SubstanceInstanceComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_40.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasExpiryElement())
            tgt.setExpiryElement((org.hl7.fhir.dstu2.model.DateTimeType) VersionConvertor_10_40.convertType(src.getExpiryElement()));
        if (src.hasQuantity()) {
            tgt.setQuantity(VersionConvertor_10_40.convertSimpleQuantity(src.getQuantity()));
        }
        return tgt;
    }
}
