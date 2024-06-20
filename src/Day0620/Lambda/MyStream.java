package Day0620.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        /*ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 6, 9, 12));
    // foEach로 최종 출력하기
        *//*number.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer));
        number.stream().map(integer -> integer * 2)
                .forEach(integer -> System.out.println(integer));
        number.stream().sorted()
                .forEach(integer -> System.out.println(integer));*//*

    List<Integer> collect = number.stream().map(integer -> integer * 2).collect(Collectors.toList());
    System.out.println(collect);

    int[] arr = {1, 2, 3, 4, 5};

    IntStream stream = Arrays.stream(arr);

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);*/

        // 홀수만 뽑아서 쓰기
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(collect);

        // 문자열의 길이
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");

        List<Integer> collect1 = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect1);*/

        /*List<Integer> numbers2 = Arrays.asList(10, 21, 35, 44, 33, 25);
        List<Integer> collect2 = numbers2.stream()
                .filter(Integer -> Integer % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println(collect2);*/

        List<String> words1 = Arrays.asList("Java", "Python", "C#", "C++", "JavaScript", "Mysql");
        List<String> collect3 = words1.stream().filter(String -> String.length() <= 5).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
