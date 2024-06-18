package Day0618.Generic;

public class Test {
    public static void main(String[] args) {
        House<Dog> dogHouse = new House<>();
        dogHouse.setHome(new Dog("개집"));
        dogHouse.printName();

        House<Cat> catHouse = new House<>();
        catHouse.setHome(new Cat("캣타워"));
        catHouse.printName();
    }
}
