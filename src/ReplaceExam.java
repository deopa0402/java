public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("today is sad");
        StringBuffer sb2 = null;
        sb2 = sb1.replace( 9, 12, "sunny"); // today is sunny가 출력되게 바꿔보세요!

        System.out.println("sb2 = " + sb2);
        System.out.println("sb1 = " + sb1);
    }
}
