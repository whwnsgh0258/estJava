package Day0614.Zoo;

public class Lion extends Animal implements Predator{
    public Lion(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return "Feed meet";
    }
}