public class Operator0603 {
    public static void main(String[] args) {
        /*int number1 = 10;
        int number2 = 3;

        int sum = number1 + number2; // 13
        int diff = number1 - number2; // 7
        int diff2 = number2 - number1; // -7

        int product = number1 * number2;
        int quot = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("덧셈= " + sum);
        System.out.println("뺄셈1= " + diff);
        System.out.println("뺄셈= " + diff2);
        System.out.println("곱셉= " + product);
        System.out.println("나숫셈= " + quot);
        System.out.println("나머지= " + remainder);

        byte a = 1;
        byte b = 2;

        int c = a + b;
        int d = a * b;
        float e = (float) a / b;
        float f = a % b;
        System.out.println(c+" "+d+" "+e+" "+f);*/


        /*String str1 = "안녕하세요 ";
        String str2 = "만나서 반갑습니다.";
        String str3 = str1 + str2;

        System.out.println(str3);

        StringBuilder sb =new StringBuilder();
        sb.append(123);
        sb.append(456);
        sb.append("Hello");
        System.out.println(sb.toString());*/

        /*int num1 = 10;
        int num2 = 50;

        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 < num2);

        System.out.println(num1 = num2);
        System.out.println(num1 != num2);*/

        /* 논리 연산자(AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        */

        /* 논리연산자(OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);*/


        /* 논리 연산자(XOR - 베타적 논리합)
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);*/

        /* 논리연산자(NOT - 부정연산자)
        System.out.println(true ^ !true);
        System.out.println(true ^ !false);
        System.out.println(false ^ !true);
        System.out.println(false ^ !false);*/

        /*// i는 2의 배수이면서 3의 배수이다
        int i;
        i = 30;
        System.out.println(i % 2 == 0 && i % 3 == 0);
        // x는 30의 배수 이면서 2의 배수 이거나 5의 배수이다.
        int x;
        x = 50;
        System.out.println((x % 30 == 0) &&( x % 2 == 0 || x % 5 == 0));*/

        int score = 90;
        String grade = (score > 95) && (score % 5 == 0) ? "Good" : "Bad";

        System.out.println(grade);
    }
}
