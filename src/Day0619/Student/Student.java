package Day0619.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
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
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no);
    }

    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();
        students.put(new Student("학생1", 1), 95);
        students.put(new Student("학생2", 2), 90);
        students.put(new Student("학생3", 3), 85);

        Set<Entry<Student, Integer>> entrySet = students.entrySet();

        System.out.println("키의 개수" + entrySet.size());
        for (Entry<Student, Integer> entry : entrySet) {
            String name = entry.getKey().getName();
            int no = entry.getKey().getNo();
            Integer value = entry.getValue();

            System.out.println(name + " " + no + "번: " + value + "점");
        }
    }
}
