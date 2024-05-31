import java.util.ArrayList;
import java.util.List;

public class Test implements TestInterface {
    /**
     * @author 조준호
     * @since 2024-05-30
     **/
    public static void main(String[] args) {
        /*
         * int a = 10;
         * a=3;
         * System.out.println(a);
         */

        /*
         * 정수형 자료형
         * int a = 1;
         * byte b = 2;
         * short c = 3;
         * long d = 4;
         * 정수타입은 각 타입마다 할당하는 정수의 크기가 다른데 그러면 그냥 제일 큰거를 사용하면 안되나?
         * 할 수 있지만 굳이 필요하지 않는 경우에는
         * 실수형 자료형
         * float e = 0.1f;
         * double f = 0.2;
         *
         * 문자형 자료형
         * char g = 'a';
         *
         * 불리언 자료형
         * boolean isTrue = true;
         * boolean isFalse = false;
         *
         * 문자열 타입
         * String str = "hello world";
         */

        /* int a= 4641254845;
         * byte c = 128;
         * short b = 54234;
         */

        /*
         * int a = 1;
         * int v = a;
         * System.out.println(a);
         */


     /*   char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6= '\uac00';

        int unicode = c1;        // 유니코드 얻기

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(unicode);
        */


        short sVal = 10;
        short result = (short) (sVal + 10);
        System.out.println(result);   // 연산 결과 20 출력

       /* float myFloat = 7.76f;

        float anotherFloat = myFloat + 2;
        System.out.println("anotherFloat = " + (int) anotherFloat);
        System.out.println("myFloat = " + myFloat);

        *boolean isTrue = true;
        if (isTrue){
            System.out.println("이건 트루");
        }else {
            System.out.println("이건 펄스");
        }*/


        int a = 10;
        int[] arr = new int[5];

        System.out.println(arr[0]);
        float b = 1.123456123456f;
        System.out.println(b);

        String str = "문자열 입니다!";
        System.out.println(str);
    }

    @Override
    public void test() {

    }
}
