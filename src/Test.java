import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* Day0611.Person person = new Day0611.Person();
        person.setSpeed(100);
        person.checkSpeed();*/

        /* Day0612.Car car = new Day0612.Car();
        car.setSpeed(-100);
        car.setCheck();*/

        /* Day0613.InheritB inheritB = new Day0613.InheritB();
        inheritB.field2 = "필드2";
        inheritB.method2();
        Day0613.InheritA inheritA = new Day0613.InheritA();
        inheritA.field1 = "100";
        inheritA.method();*/

        /*Day0613.Parants parants = new Day0613.Parants(10000);
        Day0613.Child child = new Day0613.Child(parants.money);
        parants.setMoney();
        child.getMoney();*/

        /*Day0613.Dog dog = new Day0613.Dog();
        dog.setName("두팔이");
        dog.sleep();
        dog.sleep(20);*/

        /*Day0613.Student2 student2 = new Day0613.Student2("김승조", "a", 123);
        student2.say();
        student2.say("조준호");
        student2.printInfo();*/

        /*Day0613.Child child = new Day0613.Child();

        child.method1();
        child.method2();
        child.method3();*/

        /*int r = 10;
        Day0613.Calculator calculator = new Day0613.Calculator();
        System.out.println("원 면적: "+ calculator.areaCicle(r));
        calculator.say();
        Day0613.Computer computer = new Day0613.Computer();
        System.out.println("원 면적: "+ computer.areaCicle(r));*/

        /*Day0613.SmartPhone smartPhone = new Day0613.SmartPhone("김승조");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();*/

        /*Day0613.Cat cat = new Day0613.Cat();
        cat.sound();
        System.out.println(cat.kind);

        Day0613.Dog dog = new Day0613.Dog();
        dog.sound();
        System.out.println(dog.kind);*/

        /*try{
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.println("정싱적으로 종료되었습니다.");*/

        /*try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (NullPointerException ex) {
            System.out.println("null입니다.");
        } finally {
            System.out.println("예외 여부와 상관없이 실행 됩니다.");
        }
        System.out.println("정상적으로 종료되었습니다.");
    }

    private static int divide(int a, int b) {
        if (a / b == 0) {
            throw new ArithmeticException();
        } else {
            throw new NullPointerException();
        }*/

        /*try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스를 벗어났습니다.");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            int result = n1 / n2;
            System.out.println(n1 + "/" + n2 + "=" + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눗셈을 할 수 없습니다.");
        }finally {
            System.out.println("프로그램 종료");
        }
        sc.close();


        try {
            System.out.println("크기를 입력해 주세요");
            int size = sc.nextInt();
            System.out.println("배열의 크기: " + size);
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print(i + "번째 인덱스 값: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("배열의 인덱스를 선택해 주세요");
            int index = sc.nextInt();
            System.out.println(index + "번째 배열의 요소: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
        sc.close();*/
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return -1; // 또는 다른 오류 코드를 반환
        } else {
            return a / b;
        }
    }
}
