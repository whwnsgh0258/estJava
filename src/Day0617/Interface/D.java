package Day0617.Interface;

public class D implements C{
    @Override
    public void C() {
        System.out.println("C");
    }

    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }
}
