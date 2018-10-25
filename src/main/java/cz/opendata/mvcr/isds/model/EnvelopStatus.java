package cz.opendata.mvcr.isds.model;

import java.math.BigInteger;

/**
 * Details can be found in:
 * WS_ISDS_Manipulace_s_datovymi_zpravami.pdf
 */
public enum EnvelopStatus {
    /**
     * Datová zpráva byla podána (vznikla v ISDS).
     */
    CREATE(1),
    /**
     * Datová zpráva včetně písemností podepsána podacím časovým razítkem.
     */
    HAS_TIME_STAMP(2),
    /**
     * Datová zpráva neprošla AV kontrolou - zpráva není ani dodána;
     * konečný stav zprávy před smazáním.
     */
    INVALID_MESSGE(3),
    /**
     * Datová zpráva dodána do schránky adresáta (zapsán čas dodání),
     * je přístupná adresátovi.
     */
    IN_INBOX(4),
    /**
     * Uplynulo 10 dní od dodání veřejné zprávy, která dosud nebyla doručena
     * přihlášením (předpoklad doručení fikcí u neOVM schránky); u komerční
     * nebo systémové zprávy nemůže tento stav nastat.
     */
    DELIVERED_BY_FICTION(5),
    /**
     * Osoba (nebo aplikace přihlašující se systémovým certifikátem)
     * oprávněná číst tuto zprávu se přihlásila - zpráva byla doručena
     * přihlášením.
     */
    DELIVERED_BY_LOGIN(6),
    /**
     * Zpráva byla přečtena (na portále nebo akcí ESS).
     */
    READ(7),
    /**
     * Zpráva byla označena jako nedoručitelná, protože schránka adresáta
     * byla zpětně znepřístupněna; netýká se systémových zpráv.
     */
    UNDELIVERABLE(8),
    /**
     * Obsah zprávy byl smazán, obálka zprávy včetně hashů přesunuta do
     * archivu (jen některé služby umí přistupovat k archivním obálkám zpráv)
     */
    DELETED(9),
    /**
     * Zpráva byla přesunuta do Datového trezoru odesílatele nebo adresáta
     * (nebo obou); netýká se systémových zpráv.
     */
    ARCHIVED(10),
    /**
     * Any other.
     */
    UNKNOWN(-1)
    ;

    private BigInteger value;

    EnvelopStatus(int value) {
        this.value = BigInteger.valueOf(value);
    }

    public BigInteger getValue() {
        return value;
    }

    public static EnvelopStatus fromNumber(BigInteger value) {
        for (EnvelopStatus status : EnvelopStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        return UNKNOWN;
    }

}
