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
        int[] score = {1, 30, 20, 80, 15, 20, 30, 22};
        int sum = 0;
        double avg = 0;
        for (int i : score) {
            sum += i;
            avg += (double) sum / score.length;
        }
        System.out.println("총 합: " + sum + " 평균: " + avg);

        // 실습 5
        /*String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
        for (String name : arr) {
            if (name.length() < 5) {
                continue;
            }
            System.out.println(name);
        }*/
    }
}
