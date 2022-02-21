import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TEST {

    public static void main(String[] args) throws FileNotFoundException {

    FileReader fr = new FileReader("file:resources/validEmployees.csv");
    BufferedReader br = new BufferedReader(fr);
    }
}
