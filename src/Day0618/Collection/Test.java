package Day0618.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        /*List<String> array = new ArrayList<>();
        array.add("Java");
        array.add("Spring");
        array.add("Servlet/JSP");
        array.add("JPA");

        System.out.println("총 객체 수: " + array.size());
        System.out.println("===========");
        System.out.println("두번째 인덱스: "+array.get(2));

        System.out.println(array.isEmpty());
        System.out.println(array.contains("Ja"));
        for (String str : array) {
            System.out.println(str);
        }

        ArrayList<Objects> objects = new ArrayList<>();
        objects.add(null);
        objects.clear();
        System.out.println(objects.isEmpty());*/

        List<String> arrayList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 걸린시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add( String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkList 걸린시간: " + (endTime - startTime));
    }
}
