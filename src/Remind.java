import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Remind {

    /**
     * 실습 내용 복습
     *
     * @author : 조준호
     */
    public static void main(String[] args) {
        // 06/04
        // 정수 합 구하기
        // n = 100
        /*int n = 100;
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);*/
        // 정수형 배열 합 구하기
        // 배열: numbers = [5, 2, 9, 1, 7, 4, 6, 3, 8]
        /*int[] num = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int i = 0;
        int sum = 0;
        while (i < num.length) {
            sum += num[i];
            i++;
        }
        System.out.print("배열의 총합: " + sum + " 배열의 평균: " + sum / num.length);*/

        // 배열에서 가장 큰 수 찾기
        /*int[] num = {10, 5, 8, 20, 3, 15, 9, 2};
        int max = num[0];
        int i = 1;
        while (i < num.length) {
            if (num[i] > max) {
                max = num[i];
            }
            i++;
        }
        System.out.println(max);*/

        // for문 실습1(짝수 합 계산)
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);*/

        //실습2(피보나치 이론 - 피보나치 수열 첫 10개의 항을 출력)
        /*int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 0; i<arr.length; i++){
            if(i>=2){
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.print(arr[i]+" ");
        }*/

        // 실습 3
        /*int mul = 0;
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 4) {
                    continue;
                }
                mul = i * j;
                System.out.println(i + "*" + j + "=" + mul);
            }
        }*/

        // 실습 4
        /*int[] score = {1, 30, 20, 80, 15, 20, 30, 22};
        int sum = 0;
        double avg = 0;
        for (int i : score) {
            sum += i;
            avg += (double) sum / score.length;
        }
        System.out.println("총 합: " + sum + " 평균: " + avg);
*/
        // 실습 5
        /*String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
        for (String name : arr) {
            if (name.length() < 5) {
                continue;
            }
            System.out.println(name);
        }*/

        // 06/05

        // 실습1 (숫자 입력받아서 해당하는 계절 출력)
        Scanner num = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int i = num.nextInt();
            switch (i) {
                case 1:
                    System.out.println("봄");
                    break;
                case 2:
                    System.out.println("여름");
                    break;
                case 3:
                    System.out.println("가을");
                    break;
                case 4:
                    System.out.println("겨울");
                    break;
                default:
                    System.out.println("잘못된 입력 입니다.");
                    break;
            }


        // 랜덤으로 출력된 숫자 맞추기
        /*Random rand = new Random();
        int r = rand.nextInt(100);
        Scanner num = new Scanner(System.in);
        System.out.println("값을 입력해 주세요");
        for (int i = 0; i < 10; i++) {
            int num1 = num.nextInt();
            if (num1 > r) {
                System.out.println("더 작은수를 입력 하세요");
            } else if (num1 < r) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("정답입니다! 슛자는 " + num1 + "입니다");
                break;
            }
        }
        num.close();*/

        // 로또 번호 맞추기
        /*Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (list.size() < 6) {
            int num = rand.nextInt(45);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        for (int data : list) {
            System.out.print(data + " ");
        }*/

        // 영화관 티켓 예매 시스템 만들기
        /*Scanner input = new Scanner(System.in);

        String title = input.nextLine();
        int member = Integer.parseInt(input.nextLine());
        String name = input.nextLine();
        String phone = input.nextLine();
        int cost = member * 10000;

        System.out.println("==== 영화 예매 정보 ====");
        System.out.println("영화 제목: " + title);
        System.out.println("인원 수: " + member + "명");
        System.out.println("예매자 이름: " + name);
        System.out.println("예매자 전화번호: " + phone);
        System.out.println("결제된 금액: " + cost + "원");

        input.close();*/

        // 학생 성적 정보 출력
        /*Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int ko = Integer.parseInt(input.nextLine());
        int eng = Integer.parseInt(input.nextLine());
        int math = Integer.parseInt(input.nextLine());
        int sum = ko + eng + math;
        double avg = (double)sum / 3;
        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("==== 학생 성적 정보====");
        System.out.println("이름: " + name);
        System.out.println("국어 " + ko + "점");
        System.out.println("영어: " + eng + "점");
        System.out.println("수학: " + math + "점");
        System.out.println("총합: " + sum + "점");
        System.out.printf("평균: %.2f" ,avg, "점");
        System.out.println("\n등급: " + grade);
        System.out.println("===================");

        input.close();*/
    }
}