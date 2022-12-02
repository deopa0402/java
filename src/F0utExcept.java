import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F0utExcept {
    public static void main(String[] args) {
        FileReader fw = null;
        try {
            fw = new FileReader("output.txt");
            fw.write("Test Text");
            fw.close();
        }catch(IOException e){
            System.err.println("IOException이 발생하였습니다.");
            e.printStackTrace();
        }finally{
            System.out.println("예외 여부와 관계 없이 무조건 실행되는 finally 구문");
        }
        System.out.println("F0utExcept.java 실행 완료!");
    }
}
