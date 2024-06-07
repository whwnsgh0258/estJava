public class Quiz {
    public static void main(String[] args) {
        // 6월 4일
        // 1번
         /*int count = 1;
         while (true){
             count++;
             if (count == 10001){
                 break;
             }
             System.out.println(count);
         }*/

        // 2번
        int mul;
        for (int i = 9; i > 1; i--) {
            for (int j = 1; j < 10; j++) {
                mul = i * j;
                System.out.println(i+"*"+j+"="+mul);
            }
        }
    }
}
