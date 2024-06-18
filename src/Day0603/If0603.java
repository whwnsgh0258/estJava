package Day0603;

public class If0603 {
    public static void main(String[] args) {
        /* 조건문 (if)
        int number = 10;
        if (number > 10) {
            System.out.println("number는 10보다 큽니다");
        } else if (number < 10) {
            System.out.println("number는 10보다 작습니다.");
        } else if (number > 5) {
            System.out.println("number는 5보다 큽니다");
        }

        int a = 10;
        int b = 5;
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a is less than b");
        }
        String defaultMethod = (a > b) ? "a is greater than b" : (a == b) ? "a and b are equal" : "a is less than b";
        System.out.println(defaultMethod);*/


        // if문 + 삼항연산자 활용 퀴즈
        // 퀴즈1 if문
        /*int x = 10;
        if (x > 0) {
            System.out.println("x는 양수 입니다.");
        } else if (x < 0) {
            System.out.println("x는 음수 입니다.");
        } else {
            System.out.println("x는 0입니다");
        }
        // 퀴즈1 삼항연산자
        System.out.println((x > 0) ? "x는 양수 입니다." : (x < 0) ? "x는 음수 입니다." : "x는 0입니다");*/

        // 퀴즈 2
        /*int score = 75;
        char grade;
        if (score > 90) {
            grade = 'InTerA';
        } else if (score > 80) {
            grade = 'InterB';
        } else if (score > 70) {
            grade = 'InterC';
        } else if (score > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다");*/

        // 퀴즈 3
        /*int year = 2023;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다");
        }*/

        // 퀴즈 4
        /*int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("a가 가장 큽니다.");
        } else if (b > a && b > c) {
            System.out.println("b가 가장 큽니다.");
        } else {
            System.out.println("c기 기징 큽니다.");
        }*/

        // 퀴즈 5
        int passScore = 60;
        int myScore = 75;
        if (passScore > myScore) {
            System.out.println("불합격");
        } else {
            System.out.println("합격");
        }
        // 퀴즈 5 삼항연산자
        System.out.println((passScore > myScore) ? "불합격" : "합격");

        // 논리 연산자
        /*int a = 10;
        int b = 5;

        boolean result1 = (a > 5) && (b < 10); // true && true => true
        boolean result2 = (a > 5) || (b > 10); // true || false => true
        boolean result3 = !(a > 5); // !(true) => false

        System.out.println(result1+" "+result2+" "+result3);*/

        /*boolean x = true;
        boolean y = false;
        boolean z = true;


        if (x && !y) {
            System.out.println("조건1 충족");
        } else if (y && z || !x && !z) {
            System.out.println("조건2 충족");
        } else if (x || y || z) {
            System.out.println("적어도 하나는 참");
        } else if (!x && !y && !z) {
            System.out.println("모두 거짓");
        }*/

        /*int a = 10;
        int b = 20;
        int c = 15;

        System.out.println(((a>b)&&(a>c))?"a가 가장 큼":((b>a)&&(b>c))?"b가 가장 큼":"c가 가장 큼");*/
    }
}
