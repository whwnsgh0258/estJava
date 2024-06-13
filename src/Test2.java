import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
        Mathod test = new Test2();
        System.out.println(test.good());*/
        /*Test2 test2 = new Test2();
        System.out.println(test2.add(2, 3));
        System.out.println(test2.minus(3, 2));
    }*/
    /*static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static double div(int a, int b) {
        return a / b;
    }
    static void login(String email, String password) {
    }*/

        /*Person person1 = new Person("조준호", 01000000001, 24, 10000);

        Student student = new Student();
        person1.teaching(student);
        person1.cheating(student);*/
        /*System.out.print("계좌번호를 입력 하세요: ");
        String accountNumber = sc.nextLine();
        System.out.print("소유자의 이름을 입력 하세요: ");
        String ownerName = sc.nextLine();
        BankAccount account = new BankAccount(accountNumber, ownerName);
        // 입금 및 출금
        account.deposit(100000); // 예시 입금
        account.withdraw(50000); // 예시 출금

        // 잔액 조회
        account.printBalance();

        sc.close();*/

        Person2 person1 = new Person2("누누", 25, 185, "Hi");
        Person2 person2 = new Person2("윌럼프", 28, 150, "Hi");

        person1.sayHello();
        person1.sayAge();
        person1.sayHeight();

        person2.sayHello();
        person2.sayAge();
        person2.sayHeight();
    }
}