package Day0617;

public class IClass implements Inter{
    @Override
    public void nonDefaultMethod() {
        System.out.println("default 메서드가 아닙니다.");
    }

    /*public void callDefaultMethod() {
        defaultMethod();
    }*/

    @Override
    public void defaultMethod() {
        System.out.println("default 메서드 오버라이딩으로 변경");
    }
}
