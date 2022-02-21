
import java.util.*;

/**
 * Created: 08.11.2021
 *
 * @author Kilian Baier (20190608)
 */
public class UniqueCharacters {
    private final static Map<String, Integer> uniquename = new HashMap<>();

    static int UniqueCharacters(String name) {
        Set<String> list = new HashSet<>();
        if (uniquename.containsKey(name)) {
            return uniquename.get(name);
        } else {
            for (String i : name.split("")) {
                list.add(i);

            }

        }
        uniquename.put(name, list.size());
        return list.size();

    }

    public static void main(String[] args) {
        UniqueCharacters("Hallo");
        UniqueCharacters("Hallo");
        UniqueCharacters("test");
        System.out.printf(String.valueOf(uniquename));
    }

}



