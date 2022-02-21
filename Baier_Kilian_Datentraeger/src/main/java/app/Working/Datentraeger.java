package app.Working;

/**
 * Created: 30.09.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */

public class Datentraeger {
    private final String titel;
    private double preis;
    private final int megaByteGroesse;
    static private int gesamtAnzahl = 0;



    public Datentraeger(String titel, double preis, int megaByteGroesse) throws WertNegativ {
        this.titel = titel;
        if (preis < 0 || megaByteGroesse < 0) {
            throw new WertNegativ();
        }
        this.preis = preis;
        this.megaByteGroesse = megaByteGroesse;
        gesamtAnzahl++;
    }

    public Datentraeger(String titel, double preis) throws WertNegativ {
        this(titel, preis, 700);
    }


    public void setPreis(double preis) throws WertNegativ {
        if (preis < 0) {
            throw new WertNegativ();
        }
        this.preis = preis;

    }

    public String getTitel() {
        return titel;
    }

    public double getPreis() {
        return preis;
    }

    public int getMegaByteGroesse() {
        return megaByteGroesse;
    }

    public static int getGesamtAnzahl() {
        return gesamtAnzahl;
    }
}
