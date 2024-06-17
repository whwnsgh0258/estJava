package Day0614;

import java.util.Scanner;

public class PersonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();

            Person person = new Person(name, age); // Person 객체 생성
            System.out.println("Person 객체 생성 성공!");
        } catch (InvalidAgeException e) {
            System.out.println("예외 발생: " + e.getMessage()); // InvalidAgeException 처리
        } finally {
            sc.close(); // scanner 자원 해제
        }
    }
}
