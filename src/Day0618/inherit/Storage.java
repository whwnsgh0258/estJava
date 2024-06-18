package Day0618.inherit;

public interface Storage <T>{

    void add(T item, int index);

    T get(int index);
}
