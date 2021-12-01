package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalLocalInstrument1Code {

    BACS("UK.OBIE.BACS"),
    BALANCE_TRANSFER("UK.OBIE.BalanceTransfer"),
    CHAPS("UK.OBIE.CHAPS"),
    EURO1("UK.OBIE.Euro1"),
    FPS("UK.OBIE.FPS"),
    LINK("UK.OBIE.Link"),
    MONEY_TRANSFER("UK.OBIE.MoneyTransfer"),
    PAYM("UK.OBIE.Paym"),
    SEPA_CREDIT_TRANSFER("UK.OBIE.SEPACreditTransfer"),
    SEPA_INSTANT_CREDIT_TRANSFER("UK.OBIE.SEPAInstantCreditTransfer"),
    SWIFT("UK.OBIE.SWIFT"),
    TARGET2("UK.OBIE.Target2");

    private String value;

    OBExternalLocalInstrument1Code(String value) {
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
    public static OBExternalLocalInstrument1Code fromValue(String value) {
        for (OBExternalLocalInstrument1Code enum_ : OBExternalLocalInstrument1Code.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
