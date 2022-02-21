package pairmap;

import pair.Pair;


import java.util.LinkedList;

/**
 * Created: 11.10.2021
 *
 * @author Kilian Baier (Kilian Baier)
 */
public class PairMap<K, V> implements Map<K,V>{
    LinkedList<Pair<K,V>> arr = new LinkedList<>();

    @Override
    public V put(K key, V value) {
        V temp;
        if(key == null){
            throw new IllegalArgumentException();
        }
        else{
            for(Pair<K, V> tmp : arr){
                if(tmp.getFirst().equals(key)){
                    temp = tmp.getSecond();
                    tmp.setSecond(value);
                    return temp;
                }
            }
            arr.add(new Pair<>(key,value));
        }
        return null;
    }

    @Override
    public V get(K key) {
        for (Pair<K, V> tmp : arr) {
            if (tmp.getFirst().equals(key)) {
                return tmp.getSecond();
            }

        }
        return null;
    }

    @Override
    public int size() {
        return arr.size();
    }
}
