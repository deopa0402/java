import java.io.*;

public class inputFileExam {
    public static void streamTest(InputStream is) {
        try {

        while (true) {
            int i = is.read();
            if (i == -1) break;
            char c = (char) i;
            System.out.print(c);
        }
    } catch (Exception e) {
        System.err.println(e);
    }
    System.out.println();
}
public static void main(String[] args) throws IOException{
    FileInputStream fis = new FileInputStream("in.txt");
    streamTest(fis);
    if(fis != null)
        fis.close();
}

}
