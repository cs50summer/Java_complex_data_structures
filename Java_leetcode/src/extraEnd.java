public class extraEnd {
    public static String extraEnd(String tag){
        String res="";
        if (tag.length()==0){
            return null;
        }
        if(tag.length()==2){
            for(int i=0;i<3;i++){
                res=res+tag;
            }
            return res;
        }
        if(tag.length()>2){
            //last tow ends of teh string
            //String sub=tag.substring(tag.length()-2,tag.length());
            //first two parts of the string
            String sub=tag.substring(1,2);

            for(int i=0;i<3;i++){
                res=res+sub;
            }
            return res;
        }
        return "";

    }


    public static void main(String[] args){
       System.out.print(extraEnd("afyay"));

    }
}
