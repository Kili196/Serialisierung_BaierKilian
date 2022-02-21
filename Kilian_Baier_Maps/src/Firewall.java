import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created: 08.11.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Firewall {


    private static ArrayList<String> readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("resources/firewall.txt"));
        ArrayList<String> Firewall_port = new ArrayList<>();
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Firewall_port.add(line.substring(0, line.length()-3));
        }
        return Firewall_port;
    }


    public static void Firewalls() throws FileNotFoundException {
        ArrayList<String> test = readFile();
        Map<String, TreeSet<String>> firewalls = new TreeMap<>();
        for(String i : test){
            String[] arr = i.split(" ");
            String value = arr[0];
            String key = arr[1];
            if (firewalls.containsKey(key))
                firewalls.get(key).add(value);
            else {
                firewalls.put(key, new TreeSet<>() {
                });
                firewalls.get(key).add(value);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Firewalls();
    }
}