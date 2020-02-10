package org.hl7.fhir.convertors.conv10_30;

import org.hl7.fhir.convertors.VersionConvertor_10_30;
import org.hl7.fhir.dstu2.model.Base64BinaryType;
import org.hl7.fhir.dstu2.model.InstantType;
import org.hl7.fhir.dstu2.model.StringType;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;
import java.util.stream.Collectors;

public class AuditEvent10_30 {

    public static org.hl7.fhir.dstu2.model.AuditEvent convertAuditEvent(org.hl7.fhir.dstu3.model.AuditEvent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent tgt = new org.hl7.fhir.dstu2.model.AuditEvent();
        VersionConvertor_10_30.copyDomainResource(src, tgt);
        if (src.hasType()) {
            tgt.getEvent().setType(VersionConvertor_10_30.convertCoding(src.getType()));
        }
        if (src.hasSubtype()) {
            for (org.hl7.fhir.dstu3.model.Coding t : src.getSubtype()) tgt.getEvent().addSubtype(VersionConvertor_10_30.convertCoding(t));
        }
        if (src.hasAction()) {
            tgt.getEvent().setAction(convertAuditEventAction(src.getAction()));
        }
        if (src.hasRecordedElement()) {
            tgt.getEvent().setDateTimeElement((InstantType) VersionConvertor_10_30.convertType(src.getRecordedElement()));
        }
        if (src.hasOutcome()) {
            tgt.getEvent().setOutcome(convertAuditEventOutcome(src.getOutcome()));
        }
        if (src.hasOutcomeDescElement()) {
            tgt.getEvent().setOutcomeDescElement((StringType) VersionConvertor_10_30.convertType(src.getOutcomeDescElement()));
        }
        if (src.hasPurposeOfEvent()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getPurposeOfEvent()) for (org.hl7.fhir.dstu3.model.Coding cc : t.getCoding()) tgt.getEvent().addPurposeOfEvent(VersionConvertor_10_30.convertCoding(cc));
        }
        if (src.hasAgent()) {
            for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent t : src.getAgent()) tgt.addParticipant(convertAuditEventAgentComponent(t));
        }
        if (src.hasSource()) {
            tgt.setSource(convertAuditEventSourceComponent(src.getSource()));
        }
        if (src.hasEntity()) {
            for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent t : src.getEntity()) tgt.addObject(convertAuditEventEntityComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent convertAuditEvent(org.hl7.fhir.dstu2.model.AuditEvent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent tgt = new org.hl7.fhir.dstu3.model.AuditEvent();
        VersionConvertor_10_30.copyDomainResource(src, tgt);
        if (src.hasEvent()) {
            if (src.hasEvent()) {
                tgt.setType(VersionConvertor_10_30.convertCoding(src.getEvent().getType()));
            }
            if (src.hasEvent()) {
                for (org.hl7.fhir.dstu2.model.Coding t : src.getEvent().getSubtype()) tgt.addSubtype(VersionConvertor_10_30.convertCoding(t));
            }
            if (src.hasEvent()) {
                tgt.setAction(convertAuditEventAction(src.getEvent().getAction()));
            }
            if (src.hasEvent()) {
                tgt.setRecordedElement((org.hl7.fhir.dstu3.model.InstantType) VersionConvertor_10_30.convertType(src.getEvent().getDateTimeElement()));
            }
            if (src.hasEvent()) {
                tgt.setOutcome(convertAuditEventOutcome(src.getEvent().getOutcome()));
            }
            if (src.hasEvent()) {
                tgt.setOutcomeDescElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getEvent().getOutcomeDescElement()));
            }
            if (src.hasEvent()) {
                for (org.hl7.fhir.dstu2.model.Coding t : src.getEvent().getPurposeOfEvent()) tgt.addPurposeOfEvent().addCoding(VersionConvertor_10_30.convertCoding(t));
            }
        }
        if (src.hasParticipant()) {
            for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent t : src.getParticipant()) tgt.addAgent(convertAuditEventAgentComponent(t));
        }
        if (src.hasSource()) {
            tgt.setSource(convertAuditEventSourceComponent(src.getSource()));
        }
        if (src.hasObject()) {
            for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent t : src.getObject()) tgt.addEntity(convertAuditEventEntityComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction convertAuditEventAction(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case C:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.C;
            case R:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.R;
            case U:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.U;
            case D:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.D;
            case E:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.E;
            default:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction convertAuditEventAction(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case C:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.C;
            case R:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.R;
            case U:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.U;
            case D:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.D;
            case E:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.E;
            default:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventAction.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent convertAuditEventAgentComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasRole()) {
            for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getRole()) tgt.addRole(VersionConvertor_10_30.convertCodeableConcept(t));
        }
        if (src.hasReference()) {
            tgt.setReference(VersionConvertor_10_30.convertReference(src.getReference()));
        }
        if (src.hasUserId()) {
            tgt.setUserId(VersionConvertor_10_30.convertIdentifier(src.getUserId()));
        }
        if (src.hasAltIdElement())
            tgt.setAltIdElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getAltIdElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getNameElement()));
        if (src.hasRequestorElement()) {
            tgt.setRequestorElement((BooleanType) VersionConvertor_10_30.convertType(src.getRequestorElement()));
        }
        if (src.hasLocation()) {
            tgt.setLocation(VersionConvertor_10_30.convertReference(src.getLocation()));
        }
        if (src.hasPolicy()) {
            tgt.setPolicy(src.getPolicy().stream()
              .map(policy -> (org.hl7.fhir.dstu3.model.UriType) VersionConvertor_10_30.convertType(policy))
              .collect(Collectors.toList()));
        }
        if (src.hasMedia()) {
            tgt.setMedia(VersionConvertor_10_30.convertCoding(src.getMedia()));
        }
        if (src.hasNetwork()) {
            tgt.setNetwork(convertAuditEventAgentNetworkComponent(src.getNetwork()));
        }
        if (src.hasPurposeOfUse()) {
            for (org.hl7.fhir.dstu2.model.Coding t : src.getPurposeOfUse()) tgt.addPurposeOfUse().addCoding(VersionConvertor_10_30.convertCoding(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent convertAuditEventAgentComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasRole()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getRole()) tgt.addRole(VersionConvertor_10_30.convertCodeableConcept(t));
        }
        if (src.hasReference()) {
            tgt.setReference(VersionConvertor_10_30.convertReference(src.getReference()));
        }
        if (src.hasUserId()) {
            tgt.setUserId(VersionConvertor_10_30.convertIdentifier(src.getUserId()));
        }
        if (src.hasAltIdElement())
            tgt.setAltIdElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getAltIdElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getNameElement()));
        if (src.hasRequestorElement()) {
            tgt.setRequestorElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_30.convertType(src.getRequestorElement()));
        }
        if (src.hasLocation()) {
            tgt.setLocation(VersionConvertor_10_30.convertReference(src.getLocation()));
        }
        if (src.hasPolicy()) {
            for (org.hl7.fhir.dstu3.model.UriType t : src.getPolicy()) tgt.addPolicy(t.getValue());
        }
        if (src.hasMedia()) {
            tgt.setMedia(VersionConvertor_10_30.convertCoding(src.getMedia()));
        }
        if (src.hasNetwork()) {
            tgt.setNetwork(convertAuditEventAgentNetworkComponent(src.getNetwork()));
        }
        if (src.hasPurposeOfUse()) {
            for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getPurposeOfUse()) for (org.hl7.fhir.dstu3.model.Coding cc : t.getCoding()) tgt.addPurposeOfUse(VersionConvertor_10_30.convertCoding(cc));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent convertAuditEventAgentNetworkComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasAddressElement())
            tgt.setAddressElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getAddressElement()));
        if (src.hasType()) {
            tgt.setType(convertAuditEventParticipantNetworkType(src.getType()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent convertAuditEventAgentNetworkComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasAddressElement())
            tgt.setAddressElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getAddressElement()));
        if (src.hasType()) {
            tgt.setType(convertAuditEventParticipantNetworkType(src.getType()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent convertAuditEventEntityComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_30.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasReference()) {
            tgt.setReference(VersionConvertor_10_30.convertReference(src.getReference()));
        }
        if (src.hasType()) {
            tgt.setType(VersionConvertor_10_30.convertCoding(src.getType()));
        }
        if (src.hasRole()) {
            tgt.setRole(VersionConvertor_10_30.convertCoding(src.getRole()));
        }
        if (src.hasLifecycle()) {
            tgt.setLifecycle(VersionConvertor_10_30.convertCoding(src.getLifecycle()));
        }
        if (src.hasSecurityLabel()) {
            for (org.hl7.fhir.dstu2.model.Coding t : src.getSecurityLabel()) tgt.addSecurityLabel(VersionConvertor_10_30.convertCoding(t));
        }
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getNameElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getDescriptionElement()));
        if (src.hasQuery()) {
            tgt.setQuery(src.getQuery());
        }
        if (src.hasDetail()) {
            for (org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent t : src.getDetail()) tgt.addDetail(convertAuditEventEntityDetailComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent convertAuditEventEntityComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_30.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasReference()) {
            tgt.setReference(VersionConvertor_10_30.convertReference(src.getReference()));
        }
        if (src.hasType()) {
            tgt.setType(VersionConvertor_10_30.convertCoding(src.getType()));
        }
        if (src.hasRole()) {
            tgt.setRole(VersionConvertor_10_30.convertCoding(src.getRole()));
        }
        if (src.hasLifecycle()) {
            tgt.setLifecycle(VersionConvertor_10_30.convertCoding(src.getLifecycle()));
        }
        if (src.hasSecurityLabel()) {
            for (org.hl7.fhir.dstu3.model.Coding t : src.getSecurityLabel()) tgt.addSecurityLabel(VersionConvertor_10_30.convertCoding(t));
        }
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getNameElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getDescriptionElement()));
        if (src.hasQueryElement()) {
            tgt.setQueryElement((Base64BinaryType) VersionConvertor_10_30.convertType(src.getQueryElement()));
        }
        if (src.hasDetail()) {
            for (org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent t : src.getDetail()) tgt.addDetail(convertAuditEventEntityDetailComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent convertAuditEventEntityDetailComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasTypeElement())
            tgt.setTypeElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getTypeElement()));
        if (src.hasValueElement()) {
            tgt.setValueElement((Base64BinaryType) VersionConvertor_10_30.convertType(src.getValueElement()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent convertAuditEventEntityDetailComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventObjectDetailComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventEntityDetailComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasTypeElement())
            tgt.setTypeElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getTypeElement()));
        if (src.hasValueElement()) {
            tgt.setValueElement((org.hl7.fhir.dstu3.model.Base64BinaryType) VersionConvertor_10_30.convertType(src.getValueElement()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome convertAuditEventOutcome(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case _0:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._0;
            case _4:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._4;
            case _8:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._8;
            case _12:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome._12;
            default:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome convertAuditEventOutcome(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventOutcome src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case _0:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._0;
            case _4:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._4;
            case _8:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._8;
            case _12:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome._12;
            default:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventOutcome.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType convertAuditEventParticipantNetworkType(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case _1:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._1;
            case _2:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._2;
            case _3:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._3;
            case _4:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._4;
            case _5:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType._5;
            default:
                return org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType convertAuditEventParticipantNetworkType(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventParticipantNetworkType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case _1:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType._1;
            case _2:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType._2;
            case _3:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType._3;
            case _4:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType._4;
            case _5:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType._5;
            default:
                return org.hl7.fhir.dstu3.model.AuditEvent.AuditEventAgentNetworkType.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent convertAuditEventSourceComponent(org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent tgt = new org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasSiteElement())
            tgt.setSiteElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_30.convertType(src.getSiteElement()));
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_30.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasType()) {
            for (org.hl7.fhir.dstu3.model.Coding t : src.getType()) tgt.addType(VersionConvertor_10_30.convertCoding(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent convertAuditEventSourceComponent(org.hl7.fhir.dstu2.model.AuditEvent.AuditEventSourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent tgt = new org.hl7.fhir.dstu3.model.AuditEvent.AuditEventSourceComponent();
        VersionConvertor_10_30.copyElement(src, tgt);
        if (src.hasSiteElement())
            tgt.setSiteElement((org.hl7.fhir.dstu3.model.StringType) VersionConvertor_10_30.convertType(src.getSiteElement()));
        if (src.hasIdentifier()) {
            tgt.setIdentifier(VersionConvertor_10_30.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasType()) {
            for (org.hl7.fhir.dstu2.model.Coding t : src.getType()) tgt.addType(VersionConvertor_10_30.convertCoding(t));
        }
        return tgt;
    }
}
