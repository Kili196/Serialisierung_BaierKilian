package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public abstract class Wine extends Drink {
    private final String region;

    public Wine(String region){
        this.region = region;
    }



    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "region='" + region + '\'' +
                '}';
    }
}
