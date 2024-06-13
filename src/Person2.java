public class Person2 {
    String name;
    String name2;
    int age;
    double height;
    static double FEET = 30.48;
    final String test;

    public Person2(String name, int age, double height, String test) {
        this.name = name;
        this.age = age;
        this.test = test;
        this.height = height;
    }

    private String getName2() {
        return this.name2;
    }

    public void sayHello() {
        System.out.println("my name is " + this.name);
    }

    public void sayAge() {
        System.out.println("my age is " + this.age);
    }

    public void sayHeight() {
        System.out.println("my height is " + this.height / FEET);
    }


}
