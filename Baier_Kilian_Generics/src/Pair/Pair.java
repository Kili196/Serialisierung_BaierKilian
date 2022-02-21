package pair;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (20190608)
 */
public class Pair<T, U>{
    private  final T first;
    private  U second;



    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public U getSecond(){
        return second;
    }


    public void setSecond(U second) {
        this.second = second;
    }

    public Pair<U, T> flipped(){
        return new Pair<>(second, first);

    }


}
