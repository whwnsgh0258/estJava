public class Quiz {
    public static void main(String[] args) {
        // 6월 4일
        // 1번
         /*int count = 1;
         while (true){
             count++;
             if (count == 10001){
                 break;
             }
             System.out.println(count);
         }*/

        // 2번
        int mul;
        for (int i = 9; i > 1; i--) {
            for (int j = 1; j < 10; j++) {
                mul = i * j;
                System.out.println(i+"*"+j+"="+mul);
            }
        }
    }

    public static class Switch0603 {
        public static void main(String[] args) {
            int data = 10;
            switch (data) {
                case 1:
                    System.out.println("1 입니다.");
                    break;
                case 2:
                    System.out.println("2 입니다");
                    break;
                case 3:
                    System.out.println("3 입니다");
                    break;
                case 5:
                    System.out.println("5 입니다");
                case 10:
                    System.out.println("10 입니다.");
                    break;
                default:
                    System.out.println("dasdasd");
            }

            /* switch문 연습문제 1
            String day = "월요일";

            switch(day) {
                case "월요일":
                    System.out.println("빕막기");
                break;
                case "화요일":
                    System.out.println("일하기");
                break;
                case "수요일":
                    System.out.println("엎드려있기");
                break;
                case "목요일":
                    System.out.println("앉아있기");
                break;
                case "금요일":
                    System.out.println("서있기");
                break;
                case "토요일":
                    System.out.println("누워있기");
                break;
                case "일요일":
                    System.out.println("잠자기");
                    break;
            }*/

            /*char grade;
            switch (grade = 'InterC') {
                case 'InTerA':
                    System.out.println("Excellent");
                    break;
                case 'InterB':
                    System.out.println("Good");
                    break;
                case 'InterC':
                    System.out.println("Average");
                    break;
                case 'D':
                    System.out.println("Below Average");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
            }*/
            char operator = '*';
            int num1 = 10;
            int num2 = 20;
            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
            }

            int score = 87;
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("InTerA");
                    break;
                case 8:
                    System.out.println("InterB");
                    break;
                case 7:
                    System.out.println("InterC");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
                    break;
            }

            String language = "Java";
            switch (language) {
                case "Java":
                    System.out.println("자바는 어렵습니다");
                break;
                case "Python":
                    System.out.println("딥러닝");
                break;
                case "InterC#":
                    System.out.println("게임 개발");
                break;
                case "InterC++":
                    System.out.println("자바보다 어려움");
                break;
            }
            /*
            * switch 실습문제를 풀 때 case에 비교연산자가 들어가면 안되는줄 모르고 자바스크립트에서 switch를 사용하는 것 처럼 부등호 사용했다가 계속 오류나서 왜 안되지 하고 고민했다.
            * 안되는 이유
            *
            * */
        }
    }

    public static class Operator0603 {
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
}
