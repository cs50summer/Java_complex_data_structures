public class strOne {
    public static String doubleChar(String str){
        String res="";

        for(int i=0;i<str.length();i++){
            res=res+str.charAt(i)+str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(doubleChar("Hello"));
    }
}
