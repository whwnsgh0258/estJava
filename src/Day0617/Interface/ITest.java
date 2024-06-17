package Day0617.Interface;

public class ITest {
    public static void main(String[] args) {
        C c = new D();
        // 인터페이스 C는 A와 B를 상속받기 때문에 메서드 A,B,C모두 사용할 수 있습니다.
        c.A();

        B b = new D();
        // 인터페이스 B는 상속받는게 없기 때문에 B 메서드만 호출 할 수 있습니다.
        b.B();
    }
}
