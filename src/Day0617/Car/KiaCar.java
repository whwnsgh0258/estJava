package Day0617.Car;

public class KiaCar implements Car{
    @Override
    public String showEngine() {
        return "기아 엔진";
    }

    @Override
    public int amountNavi() {
        return 10000;
    }

    @Override
    public String getTier() {
        return "한국 타이어";
    }
}
