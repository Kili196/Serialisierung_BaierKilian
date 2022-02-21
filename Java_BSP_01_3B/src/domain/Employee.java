package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;

public class Employee {
    private  static String name;
    private static String type;
    private static int  payment;

    public Employee(String name) {
        if (name != null || !name.isEmpty()) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Creates an employee from a given csv-String.
     *
     * @param csv the csv Values: type, name, payment
     * @return the newly created employee
     */
    public static Employee of(String csv){
        FileReader fr = new FileReader("file:resources/validEmployees.csv");
        BufferedReader br = new BufferedReader(fr);




        String String[] = csv.split(",");
        type = String[0];
        name = String[1];
        payment = Integer.parseInt(String[2]);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

