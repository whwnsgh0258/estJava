package Day0617.Interface;

public class ITest {
    public static void main(String[] args) {

        D d = new D();
        d.A();
        d.B();
        d.C();
        d.CallInterA();

        /*InterC c = new D();
        // 인터페이스 C는 A와 B를 상속받기 때문에 메서드 InTerA,InterB,C모두 사용할 수 있습니다.
        c.A();

        InterB b = new D();
        // 인터페이스 B는 상속받는게 없기 때문에 InterB 메서드만 호출 할 수 있습니다.
        b.B();*/
    }
}
