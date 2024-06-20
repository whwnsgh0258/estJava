package Day0620.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyLambda {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(31, 2, 3, 4, 5);
        callList(list);
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 6, 9, 12));


        // 람다식
        number.removeIf((integer) -> integer % 2 == 0);
        System.out.println(number);

        // Iterator 사용
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(number);

    }

    public static void callList(List<Integer> integerList) {
        for (int i : integerList) {
            System.out.println(i);
        }
    }
}