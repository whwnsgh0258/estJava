package Day0617.generic;

public class Test {
    public static void main(String[] args) {
        /*ArrayList<Animal> strList = new ArrayList<>();
        strList.add(new Lion());
        List list = new ArrayList<>();*/

        Box<String> stringBox =  new Box<>();
        stringBox.set("하이");
        System.out.println(stringBox.get());
    }
}
