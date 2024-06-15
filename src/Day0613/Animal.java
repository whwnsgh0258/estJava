package Day0613;

public abstract class Animal {
    /*String name;
    int time;

    public void setName(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + "zzz...");
    }*/

    protected String kind;

    public void breathe() {
        System.out.println("숨을 쉰다");
    }

    abstract void sound();
}
