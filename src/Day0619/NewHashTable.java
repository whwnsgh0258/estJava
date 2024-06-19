package Day0619;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class NewHashTable {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        map.put("spring", "qwer");
        map.put("summer", "asdf1234");
        map.put("fall", "asdf123");
        map.put("winter", "asdf123");

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요.");
            System.out.print("아이디: ");
            String id = sc.nextLine();
            System.out.print("비밀번호: ");
            String pw = sc.nextLine();
            if (map.containsKey(id)) {
                String mapPassword = map.get(id);
                if (mapPassword.equals(pw)) {
                    System.out.println("로그인에 성공 했습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 없습니다.");
            }
        }
    }
}
