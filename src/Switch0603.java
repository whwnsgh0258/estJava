public class Switch0603 {
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
        switch (grade = 'C') {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
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
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
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
            case "C#":
                System.out.println("게임 개발");
            break;
            case "C++":
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
