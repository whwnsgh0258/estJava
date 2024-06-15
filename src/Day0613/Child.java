package Day0613;

public class Child extends Parants {

    public Child(int money) {
        super(money);
    }

    void getMoney() {
        super.money -= 1000;
        System.out.println("잔고: " + this.money);
    }

    /*void method2() {
        System.out.println("Child의 메서드2 호출");
    }
    void method3() {
        System.out.println("Child의 메서드3 호출");
    }*/
}
