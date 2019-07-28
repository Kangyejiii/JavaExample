package chap13.exercise.num03;

public class Container<K,V> {
    private K k;
    private V v;



    public V getValue() {
        return v;
    }
    public K getKey()
    {
        return k;
    }

    public void set(K k,V v) {
       this.k = k;
        this.v = v;
    }





}
