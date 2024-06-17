package Day0617.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new KiaCar();

        System.out.println("엔진: " + car.showEngine());
        System.out.println("타이어: " + car.getTier());
        System.out.println("네비: " + car.amountNavi());
    }
}
