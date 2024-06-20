package Day0620.Thread;

public class MyThread extends Thread{
    private Number number;

    public MyThread(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number);
        super.run();
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread(1);
        MyThread myThread1 = new MyThread(2);
        MyThread myThread2 = new MyThread(3);
        MyThread myThread3 = new MyThread(4);
        MyThread myThread4 = new MyThread(5);


        myThread.start(); // start는 run을 호출하는 메서드
        myThread1.start();
        myThread2.start();
        myThread2.wait();
        myThread2.notify();
        Thread.sleep(10000);
        myThread3.start();
        myThread4.start();
    }
}
