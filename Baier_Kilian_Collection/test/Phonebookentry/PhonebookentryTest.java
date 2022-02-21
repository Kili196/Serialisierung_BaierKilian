package Phonebookentry;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created: 25.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public class PhonebookentryTest {
    ArrayList<Phonebookentry> phonebook = new ArrayList<>();
    ArrayList<Phonebookentry> phonebookordered = new ArrayList<>();







    @BeforeEach
    void setUp() {
        phonebook.add(new Phonebookentry("003468654765543464", "Michael"));
        phonebook.add(new Phonebookentry("003468654765543464", "Kilian"));
        phonebookordered.add(new Phonebookentry("003468654765543464", "Kilian"));
        phonebookordered.add(new Phonebookentry("003468654765543464", "Michael"));
    }

    @Test
    public void illegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phonebookentry("00012345467678", "Kilian"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phonebookentry("a00012345467678", "Kilian"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phonebookentry("+00012345467678", "Kilian"));
    }

    @Test
    public void sorted() {
        Collections.sort(phonebook);
        boolean trueorfalse = phonebook.equals(phonebookordered);
        Assertions.assertTrue( trueorfalse);
    }
    @Test
    public void Reversed() {
        Collections.sort(phonebookordered, Collections.reverseOrder());
        boolean trueorfalse = phonebook.equals(phonebookordered);
        Assertions.assertTrue(trueorfalse);
    }

}