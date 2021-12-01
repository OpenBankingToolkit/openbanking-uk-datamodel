package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalAccountIdentification4Code {

    BBAN("UK.OBIE.BBAN"),
    IBAN("UK.OBIE.IBAN"),
    PAN("UK.OBIE.PAN"),
    PAYM("UK.OBIE.Paym"),
    SORT_CODE_ACCOUNT_NUMBER("UK.OBIE.SortCodeAccountNumber");

    private String value;

    OBExternalAccountIdentification4Code(String value) {
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
    public static OBExternalAccountIdentification4Code fromValue(String value) {
        for (OBExternalAccountIdentification4Code enum_ : OBExternalAccountIdentification4Code.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
