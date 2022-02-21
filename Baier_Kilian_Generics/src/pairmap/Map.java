package pairmap;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public interface Map<K, V> {
    /*** Fuegt ein  neues  Key - Value  - Paar  dieser  Map  hinzu.* Sollte  der Key  schon  existieren ,
     * wird  der  Value  ersetzt* und der  alte  Value  wird  retourniert.* Ein key  null  wird  mit  einer  IllegalArgumentExceptionabgelehnt.**
     * @return  den  alten  Value  bzw null , wenn  der Key neu ist*/
    V put(K key, V value);

    /*** Liefert  den zum Key geh ̈origen  Value  bzw null ,* wenn  der Key  nicht  existiert .
     ** @return den zum Key geh ̈origen  Value  bzw  null*/
    V get(K key);

    /*** Liefert  die  Anzahl  der Key - Value  - Paare  in  dieser  Map.**
     * @return  Anzahl  der  Eintr ̈age in  dieser  Map*/
    int size();
}
