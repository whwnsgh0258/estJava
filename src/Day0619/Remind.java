package Day0619;

import java.util.*;
import java.util.Map.Entry;

/**
 * 1. 1.student 클래스를 만드는데 여기서는 no라는 int형, 그리고 name이라는 변수에는 String형 <br>
 * 2. HashMap 구현<br>
 * 3. 키는 Student, value (점수)int<br>
 * 4. 데이터 넣기 put 메서드활용<br>
 * 5. entrySet()활용해서 getKey(), getValue() 메서드로 키와 값을 추출해 출력<br>
 */
public class Remind {

    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("Java", "Java123");
        map.put("Python", "Python123");
        map.put("C#", "C#123");
        map.put("PHP", "PHP123");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("아이디를 입력해 주세요: ");
            String id = sc.nextLine();
            if (map.containsKey(id)) {
                String mapPw = map.get(id);
                System.out.print("비밀번호를 입력해 주세요: ");
                String pw = sc.nextLine();
                if (mapPw.equals(pw)) {
                    System.out.println("로그인 성공!");
                    break;
                }else {
                    System.out.println("비밀번호가 잘못 입력되었습니다.");
                }
            } else {
                System.out.println("아이디를 다시 입력해 주세요.");
            }
        }
    }
    /*private int no;
    private String name;

    public Remind(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Remind remind = (Remind) o;
        return no == remind.no && Objects.equals(name, remind.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }*/

    /*public static void main(String[] args) {
        Map<Remind, Integer> map = new HashMap<>();

        map.put(new Remind(1, "학생1"), 95);
        map.put(new Remind(1, "학생1"), 90);
        map.put(new Remind(3, "학생3"), 85);
        map.put(new Remind(4, "학생4"), 80);

        Set<Entry<Remind, Integer>> set = map.entrySet();
        for (Entry<Remind, Integer> entry : set) {
            String name = entry.getKey().getName();
            int no = entry.getKey().getNo();
            Integer value = entry.getValue();
            System.out.println(no + "번 " + name + ": " + value);
        }
        System.out.println("엔트리 크기: " + map.size());
    }*/
}
