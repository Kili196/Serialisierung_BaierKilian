package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Beer extends Drink {
    private final String brewery;

    public Beer(String brewery){
        this.brewery = brewery;
    }

    public String getBrewery(){
        return brewery;
    }

    @Override
    public String toString() {
        return "bottle.Beer{" +
                "brewery='" + brewery + '\'' +
                '}';
    }
}
