package Day0614.Zoo;

public class Deer extends Animal implements Herbivore{
    public Deer(String name) {
        super(name);
    }

    @Override
    public String getFood() {
        return "Feed vegetable";
    }
}
