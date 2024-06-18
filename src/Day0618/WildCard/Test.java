package Day0618.WildCard;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new HeighStudent("고등학생"));
        personCourse.add(new Student("힉생"));
        personCourse.add(new Worker("직장인"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인1"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("학생1"));
        studentCourse.add(new HeighStudent("고등학생"));

        Course<HeighStudent> heighStudentCourse = new Course<>("고등학생 과정", 5);
        heighStudentCourse.add(new HeighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(heighStudentCourse);
    }

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
        // 배열을 문자열로 String 화 시킴
    }public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
        // 배열을 문자열로 String 화 시킴
    }public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
        // 배열을 문자열로 String 화 시킴
    }
}
