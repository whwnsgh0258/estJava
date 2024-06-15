package Day0613;

import java.util.Scanner;

public class Program {
    /**
     * 사용자 입력 프로그램
     *
     * @author 조준호
     */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);*/

        /*System.out.println("정수를 입력해 주세요.");

        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("입력한 값은 " + num + " 입니다.");
        String line = sc.nextLine();
        System.out.println("정수는 " + num); // 정수형에서 enter는 \n으로 작동
        System.out.println("문자열은 " + line); // 문자열에서 enter는 문자로 인식되어 실행
        sc.close();*/

        // Scanner 문제1
        // String[] arr 배열을 만들고 index 값으로 봄, 여름, 가을, 겨울을 출력하는 방식으로 만들었는데 이렇게 만들면 0부터 3까지 숫자를 받기 때문에 switch로 풀었음
        /*System.out.println("1에서 4 사이의 숫자를 입력 하세요.");
        int num = sc.nextInt();
        sc.nextLine();
        switch (num) {
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
                System.out.println("잘못된 입력입니다.");
                break;
        }
            sc.close();*/

        /*Random randdom = new Random();

        int r = randdom.nextInt(10)+1;
        // random.nexInt(여기에 들어간 값 까지 랜덤)

        System.out.println(r);*/

        // 로또번호 생성기 *** 혼자 한번 풀어보기
        /*Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(); // 로또 번호 6개를 담기위한 list 생성 코드
        while (list.size() < 6) { // number의 크기가 6보다 작은동안 실행
            int number = rand.nextInt(45) + 1;
            if (!list.contains(number)) { // 부정을 안쓰면 continue를 써야 하는데 부정연산자를 써서 숫자를 뽑는거를 안티패턴이라고함.
                list.add(number);
            }
        }
        for (int data : list) {
            System.out.print(data + " ");
        }*/
        // 배열의 크기를 추가할 수 있는 ArrayList
        // int(예약어) -> Integer(int의 클래스 형태), boolean(예약어) -> Boolean(클래스형태), double -> Double(클래스형태)
        // 기본 타입을 warpper 타입으로 변경하는것을 boxing 이라하고 warpper 타입을 기본타입으로 바꾸는 것을 unboxing 이라 한다.


        // 숫자 맞추기 게임
        // 내가 만든 코드
        /*Scanner num = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("숫자를 입력해 보세요");

        int i = num.nextInt();

        int r = rand.nextInt(100) + 1;

        while (i != r) {
            if (i > r) {
                System.out.println("더 작은 수를 입력해 주세요");
                i = num.nextInt();
            } else if (i < r) {
                System.out.println("더 큰 수를 입력해 주세요");
                i = num.nextInt();
            }
        }
        if (i == r) {
            System.out.println("정답입니다! 숫자는" + i + "입니다.");
        }
        num.close();*/

        // 강사님 코드
        /*Scanner num = new Scanner(System.in);
        Random rand = new Random();

        int r = rand.nextInt(100) + 1;

        while (true) {
            System.out.println("숫자를 입력해 보세요");
            int i = num.nextInt();
            if (i > r) {
                System.out.println("더 작은 수를 입력해 주세요");
            } else if (i < r) {
                System.out.println("더 큰 수를 입력해 주세요");
            }else {
                System.out.println(" 정답입니다! 숫자는 "+ i +"입니다");
                break;
            }
        }

        num.close();*/

        // 영화관 예매 시스템
        Scanner str = new Scanner(System.in);

        String tit = str.nextLine();
        int member = Integer.parseInt(str.nextLine());
        String name = str.nextLine();
        String phone = str.nextLine();

        System.out.println("==== 영화관 예메정보 ====");
        System.out.println("영화 제목: " + tit);
        System.out.println("관람 인원: " + member);
        System.out.println("예매자 이름: " + name);
        System.out.println("예매자 전화번호: " + phone);

        System.out.println("총 결제금액: " + member * 10000);
    }
}
