package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBVRPConsentType {

    SWEEPING("UK.OBIE.VRPType.Sweeping"),
    OTHER("UK.OBIE.VRPType.Other");

    private String value;

    OBVRPConsentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBVRPConsentType fromValue(String value) {
        for (OBVRPConsentType enum_ : OBVRPConsentType.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
