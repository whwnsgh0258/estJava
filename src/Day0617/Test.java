package Day0617;

public class Test {
    public static void main(String[] args) {
        /*Phone applePhone = new Apple();
        Phone samsungPhone = new Samsung();

        System.out.println(applePhone.call());
        System.out.println(samsungPhone.call());

        System.out.println(applePhone.receiveCall());
        System.out.println(samsungPhone.receiveCall());*/

        IClass iClass = new IClass();

        iClass.nonDefaultMethod();
        iClass.defaultMethod();
    }
}
