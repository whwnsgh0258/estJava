package Day0617.generic;

public class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
        System.out.println(t);
    }
}