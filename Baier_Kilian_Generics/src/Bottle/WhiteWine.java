package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class WhiteWine extends Wine {



    public WhiteWine(String region) {
        super(region);
    }

    @Override
    public String toString() {
        return "WhiteWine{" +
                "region='" + getRegion() + '\'' +
                '}';
    }
}
