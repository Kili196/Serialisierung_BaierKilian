package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Main {
    public static void main(String[] args) {


        Bottle<Beer> beer = new Bottle<Beer>();
        beer.fill(new Beer("Zwettler"));
        System.out.println(beer);
        Beer ret = beer.empty();
        System.out.println(beer);
        Bottle<Wine> wine = new Bottle< Wine>();
        wine.fill((new WhiteWine("Kamptal")));
        System.out.println(wine);
        wine.empty();
        System.out.println(wine);
        wine.fill(new RedWine("Carnuntum"));
        System.out.println(wine);
    }

}
