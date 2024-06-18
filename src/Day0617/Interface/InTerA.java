package Day0617.Interface;

public interface InTerA {
    void A();
    default void InterA() {
        System.out.println("InterA의 디폴트 메서드");
    }
}
