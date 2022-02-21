package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class RedWine extends Wine {


    public RedWine(String region) {
        super(region);
    }

    @Override
    public String toString() {
        return "bottle.RedWine{" +
                "region='" + getRegion() + '\'' +
                '}';
    }
}
