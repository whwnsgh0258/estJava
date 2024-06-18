package Day0618.WildCard;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) new Object[capacity]; // Object 배열이 capacity 만큼 생성됨
        // 타입 파라미터로 배열을 생성하기 위해서는 new T[n]이 아닌 (T[]) (new Object[n])로 생성 해야함
    }

    public String getName() {
        return this.name;
    }

    public T[] getStudents() {
        return this.students;
    }
    // 배열의 비어있는 부분을 찾아서
    public void add(T t) {
        for (int i = 0; i < students.length; i++) { // i는 0부터 students 배열의 크기보다 작은동안 1씩 증가하면서 코드블럭 실행
            if (students[i] == null) { // students 배열의 i번째 인덱스의 값이 null 일때 코드블럭 실행
                students[i] = t; // students 배열의 i번째 인덱스의 값은 t
                break;
            }
        }
    }
}
