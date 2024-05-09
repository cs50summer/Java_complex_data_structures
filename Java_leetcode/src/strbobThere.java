public class strbobThere {
    public static boolean bobThere(String str) {

        for(int i=0; i<str.length()-1;i++){
            int j;
            if(i+2<=str.length()-1){j=i+2;}
            else{j=str.length()-1;}
            String sub=str.substring(i,j);
            if((sub.equals("bob"))||((str.charAt(i)=='b'&&str.charAt(j)=='b'&&sub.length()==2))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(bobThere("boboooot"));
    }

}
