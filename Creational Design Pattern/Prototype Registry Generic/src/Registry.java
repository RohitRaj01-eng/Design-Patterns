import java.util.*;

public class Registry<K, T extends Prototype<T>> {
    private final Map<K,T> registry=new HashMap<>();

    public void register(K key, T value){
        if(registry.containsKey(key))throw new IllegalArgumentException("Prototype already registered");
        registry.put(key,value.clone());
    }

    public T getPrototype(K key){
        T value=registry.get(key);
        if(value==null)throw new IllegalArgumentException("Prototype does not exists");
        return value.clone();
    }
}
