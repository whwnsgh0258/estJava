package Day0617.phone;

public class Apple implements Phone{

    @Override
    public String call() {
        return "애플 폰으로 전화 걸음";
    }

    @Override
    public String receiveCall() {
        return "애플 폰으로 전화 받음";
    }
}
