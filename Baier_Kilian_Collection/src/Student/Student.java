package Student;

import java.util.ArrayList;


/**
 * Created: 25.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public class Student {
    private final String nachname;
    private final String vorname;
    private final int matrikelnummer;
    private final static ArrayList<Integer> list1= new ArrayList<>();

    public Student(String nachname, String vorname, int matrikelnummer){
        this.nachname = nachname;
        this.vorname = vorname;
        if(list1.contains(matrikelnummer)){
            throw new IllegalArgumentException("Matrikelnummer bereits vorhanden!");
        }
        else{
            this.matrikelnummer = matrikelnummer;
            list1.add(matrikelnummer);
        }
    }

    @Override
    public String toString() {
        return nachname + ", " + vorname + " (" + matrikelnummer + ")";
    }
}
