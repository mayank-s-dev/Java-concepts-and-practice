package Classes.GenericClass;

public class MutlipleGenericType <K, V>{
    private K key;
    private V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }
}
