public class Mathod {
    public static void main(String[] args) {
    }
        /*public static void call() {
        // System.out.println("call");

    }*/

    /*private int a = 1;

    public String b = "hello";

    public String good() {
        return "okay";
    }

    private void add() {
        System.out.println("add");
    }*/
    /*int add(int a1, int b1) {
        return a1 + b1;
    }

    int minus(int a1, int b1) {
        return a1 - b1;
    }*/

    public static class Person2 {
        String name;
        int age;
        String number;
        double height;
        static final double FEET = 30.48;

        public Person2(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public void printName() {
            System.out.println("my name is " + this.name);
        }

        public void printAge() {
            System.out.println("I am " + this.age + " years old");
        }
        public void printHeight() {
            System.out.println("I am " + this.height + "cm" + ", " + this.height / FEET + "feet");
        }
        protected void testMethod(){
            System.out.println("test");
        }
    }
}
