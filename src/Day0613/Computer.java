package Day0613;

public class Computer extends Calculator {

    @Override
    double areaCicle(double r) {
        System.out.println("Day0613.Computer 객체의 areaCircle 메서드 실행");
        return Math.PI * r * r;
    }

    @Override
    void say() {
        System.out.println("변경");
    }
}
