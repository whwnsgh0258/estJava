package Day0613;

public class Calculator {
    private static final double PI = 3.14159;

    double areaCicle(double r) {
        System.out.println("Day0613.Calculator 객체의 areaCicle 메서드 실행");
        return PI * r * r;
    }

    void say() {
        System.out.println("테스트");
    }
}
