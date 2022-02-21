package bottle;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Bottle<T extends Drink>{
    private T content;
    private boolean isEmpty = true;

    public void fill(T Drink){
        content  = Drink;
        isEmpty = false;
    }


    public T empty(){
        isEmpty = true;
        return content;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "bottle.Bottle{" +
                    "content=" + "empty}";
        }
        else {

            return "bottle.Bottle{" +
                    "content=" + content +
                    '}';
        }
    }
}
