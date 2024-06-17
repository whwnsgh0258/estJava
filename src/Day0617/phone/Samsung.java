package Day0617.phone;

public class Samsung implements Phone{

    @Override
    public String call() {
        return "삼성 폰으로 전화 걸음";
    }

    @Override
    public String receiveCall() {
        return "삼성 폰으로 전화 받음";
    }
}
