package Day0617.Interface;

public class D implements InterC {
    @Override
    public void A() {
        System.out.println("InTerA");
    }

    @Override
    public void B() {
        System.out.println("InterB");
    }

    @Override
    public void C() {
        System.out.println("InterC");
    }

    public void CallInterA(){
        InterC.super.InterA();
    }
}
