public class Strendother {
    public static boolean strendother(String a, String b){
        String comp="", rep="", newt=" ";
        int startIndex=0,endIndex=0;
        if(a.length()>b.length()){
             comp =b;
             rep=a;
        }
        else{
             comp=a;
             rep=b;
        }

        for(int i=0;i<rep.length();i++){
            startIndex=i;
            int len=comp.length();

            if((startIndex+len)<=rep.length()){
                endIndex=startIndex+len;
            }
            else{
                endIndex=rep.length();
            }
            String sub =rep.substring(startIndex,endIndex);

            if(sub.equals(comp)&& (startIndex==0 || (startIndex==rep.length()-len))){
                return true;
            }
        }


        return false;
    }




    public static void main (String[] args){
        System.out.println(strendother("xpix","pi"));
    }
}
