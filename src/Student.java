public class Student {
    // 멤버 변수(클래스의 상태)
    int level;

    // 메서드(기능)
    public Student() {
        this.level = 1;
    }

    public void levelUp() {
        level++;
        System.out.println("레벨이 1 증가했습니다.");
        System.out.println("현재 레벨은 " + level + "입니다");
    }

    public void levelDown() {
        if (level > 1) {
            level--;
            System.out.println("레벨이 1 감소했습니다.");
            System.out.println("현재 레벨은" + level + "입니다");
        }else {
            System.out.println("레벨을 더이상 감소시킬 수 없습니다");
        }
    }
}
