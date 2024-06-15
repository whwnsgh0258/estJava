package Day0531;

public class String0531 {
    /**
     * @author 조준호
     * @since 2024-05-31
     **/
    public static void main(String[] args) {
            /*String firstName = "JunHo";
        String secondName = "JO";
        String phone = "iphone";
        String status = "good";

        System.out.println("나는 " + firstName + secondName + " 입니다.");
        System.out.println(phone + " is " + status);*/

        /*String a = "hello";
        String b = new String("hello");

        System.out.println(a.equals(b));
        System.out.println( a == b);*/ // 값을 비교하는 것이 아닌 참조젼수 String이 가지고 있는 메모리 주소를 비교하기 때문에 flase가 나옴

        /*String a = "Hello World!";

        System.out.println(a.indexOf("l"));*/

        /*String b = "EST SOFT";
        System.out.println(b.contains("SOFT"));*/ // cantains는 문자열에서 특정한 문자열이 포함되어 있는지 확인하는 메서드 입니다.

        /*String findChar = "What is your hobby?";
        System.out.println(findChar.charAt(13)+""+findChar.charAt(14)+""+findChar.charAt(15)+""+findChar.charAt(16)+""+findChar.charAt(17));*/

        /*String a = "Hello World!";
        System.out.println(a.replaceAll("World", "Java"));*/


        /*String a = "WEEE ASKE ;ND";
        System.out.println(a.length());
        System.out.println(a.substring(0, 3) + a.substring(7, 9) + a.substring(11, 13));*/

        String a = "a:b:c:d:e";

        String[] split = a.split(":");
        System.out.println(split[4]);

        /*String name1 = "Tim";
        int age1 = 20;

        String name2 = "Anna";
        int age2 = 30;

        String format = String.format("%s의 나이는 %s 입니다.", name1, age1);
        String format1 = String.format("%s의 나이는 %s 입니다.", name2, age2);

        System.out.println(format);
        System.out.println(format1);*/

        /*String result = ""; // 빈 문자열 이라고 해도 boolean으로 값을 확인하면 true가 나옵니다.
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println(result);*/

        /*StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("Java ");
        sb.append("World!");
        System.out.println(sb);*/ // 원래는 .toString()을 붙혀야 했음

        /*StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello ");
        sb1.append("Java ");
        sb1.append("World!");
        System.out.println(sb1);*/

        /*StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.insert(0,"World"); // .insert(배열의 주소, 삽입할 값)
        sb.insert(0,"World");
        sb.insert(0,"World");
        sb.insert(0,"World");
        System.out.println(sb);*/

        /*for (int i = 0; i < 5 ; i++) {
            String str = "String";
            System.out.println(str);
        };
        String a = "Hello World!";
        System.out.println(a.indexOf("H"));*/

        /*String a = "Hello World!";
        System.out.println(a.contains("H World"));*/
    }
}
