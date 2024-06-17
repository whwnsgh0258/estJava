package Day0614.Zoo;

public class Tiger extends Animal implements Predator{
    public Tiger(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return "Feed fish";
    }
}
