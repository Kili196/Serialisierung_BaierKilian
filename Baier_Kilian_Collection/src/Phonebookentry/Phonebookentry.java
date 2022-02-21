package Phonebookentry;

import java.util.Objects;

/**
 * Created: 18.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Phonebookentry implements Comparable<Phonebookentry> {
    private String number;
    private final String name;


    public Phonebookentry(String number, String name) {
        final String tmp;
        try {
            Double.parseDouble(number);

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        tmp = number.substring(0, 3);
        if ((tmp.equals("000"))) {
            throw new IllegalArgumentException();
        }
        if (number.charAt(0) == 0) {
            this.number = number;
        } else if (tmp.charAt(1) != 0 && tmp.charAt(0) == '+') {
            this.number = number;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebookentry that = (Phonebookentry) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Phonebookentry o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Phonebookentry{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}