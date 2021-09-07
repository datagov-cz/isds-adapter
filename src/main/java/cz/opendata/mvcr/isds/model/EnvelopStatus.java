package cz.opendata.mvcr.isds.model;

import java.math.BigInteger;
import java.util.EnumSet;

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
    HAS_TIMESTAMP(2),
    /**
     * Datová zpráva neprošla AV kontrolou - zpráva není ani dodána;
     * konečný stav zprávy před smazáním.
     */
    VIRUS_FOUND(3),
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
     * archivu (jen některé služby umí přistupovat k archivním obálkám zpráv).
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
    UNKNOWN(-1);

    private final int value;

    EnvelopStatus(int value) {
        this.value = value;
    }

    public static EnvelopStatus fromNumber(BigInteger value) {
        int valueAsInt = value.intValue();
        for (EnvelopStatus status : EnvelopStatus.values()) {
            if (status.value == valueAsInt) {
                return status;
            }
        }
        return UNKNOWN;
    }

    public static int toInt(EnumSet<EnvelopStatus> states) {
        if (states == null || states.size() == 0) {
            return -1;
        }
        int result = 0;
        for (EnvelopStatus state : states) {
            result |= (1 << state.value);
        }
        return result;
    }

    public static String unreadFilter() {
        // Aby bylo možno došlou zprávu stáhnout, musí být ve stavu 5,6,7 nebo
        // 10. Stažením netrezorové zprávy se obvykle mění její stav na 7
        // (v ESS ne automaticky, ale explicitním voláním WS MarkAsDownloaded).
        return String.valueOf(EnvelopStatus.toInt(EnumSet.of(
                EnvelopStatus.IN_INBOX,
                EnvelopStatus.DELIVERED_BY_FICTION,
                EnvelopStatus.DELIVERED_BY_LOGIN)));
    }

}
