public class for0604 {
    public static void main(String[] args) {
        // while 문
        /*int i = 1;
        while (i <= 5) {
            System.out.println("햔재 i의 값은 = " + i);
            i++;
        }*/

        /* 문제 1 - 10부터 0까지 출력
        int i = 10;
        while (i >= 0) {
            System.out.println("현재 카운트: " + i);
            i--;
        }
        System.out.println("카운트 종료");*/

        // 문제 2 1~100까지 합
        /*int i = 1;
        int n = 100;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        // 참고
        int sum2 = IntStream.rangeClosed(1, 100).sum();

        System.out.println(sum2);*/

        // 문제 3 평균 구하기
        /*int[] num = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int i = 0;
        int sum = 0;
        while (num.length > i) {
            sum += num[i];
            i++;
        }
        System.out.println(sum / num.length);*/

        // while에 if문 사용
        /*int i = 0;
        while(i<=300){
            if (i%3==0) {
                System.out.println(i);
            }
            i++;
        }*/

        // 문제 4 배열에서 가장 큰 수 구하기
        /*int[] nums = {10, 5, 8, 20, 3, 15, 9, 2};
        int max = nums[0];
        int i = 1;
        while (nums.length > i) {
            if (nums[i] > max) {
                max = nums[i];
            }
            i++;
        }
        System.out.println(max);*/

        // 문제 5 배열에서 양수, 음수의 합(방법1)
        /*int[] num = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i < num.length) {
            if (num[i] > 0) {
                sum1 += num[i];
            } else  {
                sum2 += num[i];
            }
            i++;
        }
        System.out.println(sum1);
        System.out.println(sum2);*/

        // 방법2
        /*int posNum = IntStream.of(num).filter(num -> num > 0).sum();
        int neNum = IntStream.of(num).filter(num -> num < 0).sum();*/

        // for문
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);*/

        /*int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);*/

        // 피보나치 이론
        /*int[] num = new int[10];
        num[0] = 1;
        num[1] = num[0];
        for (int i = 0; i < num.length; i++) {
            if (i >= 2) {
                num[i] = num[i - 1] + num[i - 2];
            }
            System.out.println(num[i]);
        }*/

       /* for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }*/

        // 0부터 -100 까지 하향식으로 짝수만 출력
        /*for (int i = -1; i >= -100; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        // 피보나치 배열 100까지
        /*int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i>=2) {
                arr[i] = arr[i - 1] + arr[i-2];
            }
            System.out.println(arr[i]);
        }*/
        // 이것도 가능
        /*Arrays.parallelSetAll(arr, i -> (i < 2) ? 1 : arr[i - 2] + arr[i - 1]);
        System.out.println(arr[arr.length - 1]);*/


        // 구구단 2단
        /*int mul;
        for (int i = 1; i < 10; i++) {
            mul = i * 2;
            System.out.println(i + " * 2 = " + mul);
        }*/

        // 이중 반복문 ex) 구구단
        /*int mul;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                mul = i * j;
                System.out.println(i + "*" + j + "=" + mul);
            }
        }*/

        // 구구단(역방향)
        /*int mul;
        for (int i = 19; i > 1; i--) {
            for (int j = 19; j > 0; j--) {
                mul = i * j;
                System.out.println(i + " * " + j + " = " + mul);
            }
        }*/
        // 이중 for문. i -> 1~100, j-> 2~100
        // i가 5이 되면 break, j는 8일때 break
        /*for (int i = 1; i < 11; i++) {
            System.out.println("현재 i의 값은: " + i);
            if (i >= 50) {
                break;
            }
            for (int j = 2; j < 11; j++) {
                System.out.println("현재 j의 값은: " + j);
                if (j >= 80) {
                    break;
                }
            }
        }*/

        // 조건문 continue
        /*int num = 0;
        while (num < 10) {
            num++;
            if (num == 3) {
                continue;
            } else {
                System.out.println("현재 값은" + num);
            }
        }*/
        /*for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue; // 여기에 해당하는 부분은 무시하고 다음거 실행
            } // 이거는 else 필요 없음
            System.out.println("현재 값은" + i);
        }*/

        // 퀴즈 (반복문 continue)
        /*for (int i = 1; i < 10; i++) {
            if (i == 4 || i == 7) {
                continue;
            }
            System.out.println("현재값은 " + i);
        }*/

        // 향상된 반복문
        /*int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i : arr){
            System.out.print(i + " ");
        }*/

        // 정수형 배열 반복문
        /*int[] score = {1, 30, 20, 80, 15, 20, 30, 22};
        int sum = 0;
        double aver = 0;
        for (int i : score) {
            sum += i;
            aver = (double)sum / score.length;
        }
        System.out.println("합: " + sum);
        System.out.println("평균: " + aver);*/

        // 문자열 배열 반복문
        String[] arr = {"okay2","asbds","good2","ormiiiii","abcde"};

        for(String name : arr) {
            if (name.length()>=5){
                System.out.println(name);
            }
        }
    }
}
