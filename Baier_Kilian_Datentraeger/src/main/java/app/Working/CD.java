package app.Working;

/**
 * Created: 30.09.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */

public class CD extends Datentraeger {

   private  final boolean readOnly;

   public CD(String titel, double preis, int megaByteGroesse, boolean readOnly) throws WertNegativ {
      super(titel, preis, megaByteGroesse);
      this.readOnly = readOnly;
   }

   @Override
   public String toString() {
      return "Titel: " + getTitel() + " Preis: " + getPreis() + " Megabyte: " + getMegaByteGroesse() + " readOnly: " + readOnly;
   }
}
