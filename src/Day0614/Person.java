package Day0614;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("나이는 음수일 수 없습니다."); // 나이가 음수이면 InvalidAgeException 발생
        }
        this.name = name;
        this.age = age;
    }
}
