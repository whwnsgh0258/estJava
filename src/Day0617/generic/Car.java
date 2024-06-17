package Day0617.generic;

public class Car <T>{
    private T t;

    public T getCar() {
        return t;
    }
    public void setCar(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        Car<String> car = new Car<>();

        car.setCar("BMW");
        System.out.println(car.getCar());
    }
}
