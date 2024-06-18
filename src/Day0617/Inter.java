package Day0617;

public interface Inter {
    void nonDefaultMethod();
    default void defaultMethod(){
        System.out.println("인터페이스의 default 메서드입니다.");
    }
}
