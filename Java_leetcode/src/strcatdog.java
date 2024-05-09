public class strcatdog {
    public static boolean catdog(String str){
        int catcount=0;
        int dogcount=0;
        int startIndex=0;
        int endIndex=0;

        for(int i=0;i<str.length();i++){

            startIndex=i;
            if((startIndex+3)<=str.length()){
                endIndex=i+3;
            }
            else{
                endIndex=str.length();
            }
            String sub=str.substring(startIndex,endIndex);
            if (sub.equals("cat")) {
                catcount++;
            }
            if(sub.equals("dog")){
                dogcount++;
            }

        }
        if(catcount==dogcount){
            return true;
        }


        return false;
    }
    public static void main(String[] args){
        System.out.println(catdog("catdogcatdogdog dog"));
    }
}
