/**
 * WrapValueOf
 */
public class WrapValueOf {

    public static void main(String[] args) {
        String str1 = "1024";
        String str2 = "3.141592";
 
        
        Integer b = Integer.valueOf(str1);
        Double i1 = Double.valueOf(str2);
        Double d1 = Double.valueOf(str1);
        Double d2 = Double.valueOf(str2);


        System.out.println("b: "+ b);
        System.out.println("i1: " +i1);
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
    }
}