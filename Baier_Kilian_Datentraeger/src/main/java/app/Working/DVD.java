package app.Working;

/**
 * Created: 01.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public class DVD extends Datentraeger {
    private final char plusOderMinus;
    private final  boolean readOnlny;

    public DVD(String titel, double preis, int megaByteGroesse,boolean readOnlny,  char plusOderMinus ) throws WertNegativ {
        super(titel, preis, megaByteGroesse);
        this.readOnlny = readOnlny;
        if (plusOderMinus == '+' || plusOderMinus == '-') {

            this.plusOderMinus = plusOderMinus;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Titel: " + getTitel() + " Preis: " + getPreis() + " Megabyte: " + getMegaByteGroesse() + " plusOderMinus: " + plusOderMinus;
    }
}
