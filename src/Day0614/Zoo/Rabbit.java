package Day0614.Zoo;

public class Rabbit extends Animal implements Herbivore{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return "Feed carrot";
    }
}
