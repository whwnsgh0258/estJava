package Day0618;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*public static < T extends Number> int Compare(T a, T b) {
        double v1 = a.doubleValue();
        double v2 = b.doubleValue();
        return Double.compare(v1, v2);
    }*/

    public  static < T extends String> String Compare(T a, T b) {
        return a.equals(b) ? "okay" : "no";
    }
    public static void main(String[] args) {
//        System.out.println(Compare(1,2));
        System.out.println(Compare("하이", "하이"));
        List<String> array = new ArrayList<String>();
        array.add("홍길동1");
        array.add("홍길동2");
        array.add("홍길동2");
        array.add("홍길동2");
        array.add("홍길동4");
        array.add("홍길동5");
        array.remove("홍길동2");
        array.removeIf((s)-> s.equals("홍길동2"));
        /*for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/

        // foreach(타입 변수 : 순회할 리스트)
        for(String str : array) {
            System.out.println(str);
        }
    }
}
