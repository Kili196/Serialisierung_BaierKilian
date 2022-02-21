package Pair;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Main {
    public static void main(String[] args) {
        pair.Brot brot = new pair.Brot();
        Wurst wurst = new Wurst();
        pair.Pair<pair.Brot, Wurst> wurstbrot = new pair.Pair<>(brot, wurst);
        Brot brotRet = wurstbrot.getFirst(); // == brot
        Wurst  wurstRet = wurstbrot.getSecond (); // == wurst
        System.out.println(brotRet);
        System.out.println(wurstRet);


        Pair<Integer, String> pair = new Pair<>(3, "if");
        Pair<String, Integer> flipped = pair.flipped();
        System.out.println(flipped.getSecond().equals(pair.getFirst())); //true
    }
}
