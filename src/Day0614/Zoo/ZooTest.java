package Day0614.Zoo;

public class ZooTest {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger("tiger");
        System.out.print(tiger.name + ": ");
        zooKeeper.feed(tiger);

        Lion lion = new Lion("lion");
        System.out.print(lion.name + ": ");
        zooKeeper.feed(lion);

        Rabbit rabbit = new Rabbit("rabbit");
        System.out.print(rabbit.name + ": ");
        zooKeeper.feed2(rabbit);

        Deer deer = new Deer("deer");
        System.out.print(deer.name + ": ");
        zooKeeper.feed2(deer);
    }
}
