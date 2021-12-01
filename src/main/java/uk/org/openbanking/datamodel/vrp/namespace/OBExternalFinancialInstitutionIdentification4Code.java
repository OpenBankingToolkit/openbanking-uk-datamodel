package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalFinancialInstitutionIdentification4Code {
    UK_OBIE_BICFI("UK.OBIE.BICFI");

    private String value;

    OBExternalFinancialInstitutionIdentification4Code(String value) {
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
    public static OBExternalFinancialInstitutionIdentification4Code fromValue(String value) {
        for (OBExternalFinancialInstitutionIdentification4Code enum_ : OBExternalFinancialInstitutionIdentification4Code.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
