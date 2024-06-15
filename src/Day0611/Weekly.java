package Day0611;

import java.util.Scanner;

public class Weekly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while (true){
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                a = sc.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                b = sc.nextInt();
                System.out.println(a + "+" + b + "=" + (a + b));
            } else if (i == 2) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                a = sc.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                b = sc.nextInt();
                System.out.println(a + "-" + b + "=" + (a - b));
            } else if (i == 3) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                a = sc.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                b = sc.nextInt();
                System.out.println(a + "+" + b + "=" + (a * b));
            } else if (i == 4) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                a = sc.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                b = sc.nextInt();
                System.out.println(a + "+" + b + "=" + (a / b));
            } else if (i == 0) {
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
    }
}
