public class CoronaExam {
    /**
     * @param args
     */
    public static void main(String[] args) {
        float temp = (float) 36.5;
        float Temp = (float) temp;
        System.out.println("체온: "+ temp + "도");
        Temp = (Float) getCovid(Temp);
        System.err.println("코로나에 걸린 뒤 체온:" +Temp()+ "도");
    }

    private static String Temp() {
        return null;
    }

    public static Object getCovid(Object temp){
        return  (float)temp+5.7 ;
    }
}
