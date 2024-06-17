package Day0617.generic;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> tbox = new Box<>();
        tbox.set(t);
        return tbox;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        int i = box1.get();
        System.out.println(i);

        Box<String> box2 = Util.boxing("하이");
        String str = box2.get();
        System.out.println(str.toString());
    }
}
