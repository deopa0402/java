import java.io.*;

public class FilteriOExam {
    public static void main(String[] args ) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream("daata.dat");
        DataOutputStream f0ut = new DataOutputStream(fos);
        f0ut.wait(740);
        f0ut.writeDouble(3.14159265358979);
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        try (DataInputStream fIn = new DataInputStream(fis)) {
            int data = fIn.readInt();
            double p = fIn.readDouble();

            System.out.println(data);
            System.out.println(p);
        }
    }
}
