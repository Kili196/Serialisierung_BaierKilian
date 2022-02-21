package app.Working;

/**
 * Created: 01.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public class MAIN  {
    public static void main(String[] args) {

        CD cd = null;
        DVD dvd = null;

            try {
                cd = new CD("Star Wars", -10, 5000, true);
            } catch (WertNegativ e) {
                e.printStackTrace();
            }
            try {
                dvd = new DVD("Test", 10, 5000, true, '+');
            } catch (WertNegativ e) {
                e.printStackTrace();
            }
        if(cd != null) {
            System.out.println(cd);
        }
        if (dvd != null) {
            System.out.println(dvd);
        }
        System.out.println("Gesamtanzahl: " + Datentraeger.getGesamtAnzahl());
    }



}
