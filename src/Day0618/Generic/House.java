package Day0618.Generic;

public class House <T extends Animal>{
    private T home;

    public T getHome() {
        return home;
    }

    public void setHome(T home) {
        this.home = home;
    }

    public void printName(){
        System.out.println(home.getName());
    }
}
