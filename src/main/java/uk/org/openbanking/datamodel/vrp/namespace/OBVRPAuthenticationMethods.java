package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBVRPAuthenticationMethods {

    SCA("UK.OBIE.SCA"),
    SCA_NOT_REQUIRED("UK.OBIE.SCANotRequired");

    private String value;

    OBVRPAuthenticationMethods(String value) {
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
    public static OBVRPAuthenticationMethods fromValue(String value) {
        for (OBVRPAuthenticationMethods enum_ : OBVRPAuthenticationMethods.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
