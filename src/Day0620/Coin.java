package Day0620;

import Day0620.Thread.MyThread;

public class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        call();
        call1();
        call2();
        return value;
    }

    static void call() {
        System.out.println("Calling coin");
    }

    private void call1() {
        System.out.println("call1");
    }

    private void call2() {
        System.out.println("call2");
    }

}
