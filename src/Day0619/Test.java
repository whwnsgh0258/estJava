package Day0619;

import java.util.*;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {
        /*Set<Integer> integerSet = new HashSet<>();

        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);

        Iterator<Integer> iterator = integerSet.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        for (int a : integerSet) {
            System.out.println(a);
        }*/

        /*Set<String> stringSet = new HashSet<>();

        stringSet.add("Java");
        stringSet.add("Spring");
        stringSet.add("Jsp");
        stringSet.add("Java");
        stringSet.add("DBMS");
        stringSet.remove("Java");

        System.out.println(stringSet.size());

        Iterator<String> iterator = stringSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        // 같은 데이터를 저장 하더라도 new를 사용해 주면 다른 인스턴스가 됩니다.

        System.out.println("총 객체수: " + set.size());

        /*Map<String,Integer> map = new HashMap<>();

        map.put("홍길동", 30);
        map.put("홍길동", 31);
        System.out.println(map.remove("홍길동"));
        System.out.println(map.size());
        System.out.println(map.get("홍길동"));*/

        /*Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("홍길동");
        list1.add("홍길동");
        list1.add("홍길동");
        map.put("키", list1);*/

        /*Set<String> set1 = new HashSet<>();
        Iterator<String> iterator = set1.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            List<String> stringList1 = map.get(next);
            System.out.println(stringList1);
        }*/

        /*Set<Entry<String, List<String>>> entrySet = map.entrySet();

        for (Map.Entry<String, List<String>> entry : entrySet) {
            String key = entry.getKey();
            List<String> value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }*/

        // 1. Map 컬렉션 생성
        /*Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 80);
        map.put("카리나", 85);
        map.put("제시카", 95);
        map.put("홍길동", 80);        // "홍길동" 키가 같기 때문에 가장 마지막에 저장한 값으로 엎어씀
        System.out.println("총 Entry 수: " + map.size());    // 저장된 총 Entry 수 얻기

        // 2. 객체 찾기
        System.out.println("\t홍길동: " + map.get("홍길동"));
        System.out.println();

        // 3. 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 4. 객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());

        // 5. 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());*/

        // HashSet 예시
        Set<String> hashSet = new HashSet<>();
        hashSet.add("카리나");
        hashSet.add("하니");
        hashSet.add("윈터");
        hashSet.add("장원영");
        System.out.println("저장된 객체: " + hashSet.size());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        hashSet.remove("장원영");

        iterator = hashSet.iterator();
        System.out.println("저장된 객체: " + hashSet.size());
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}