public class strxybalance {

    public static boolean strxybalance(String str){
        int xindex=0,xcount=0;
        int yindex=0,ycount=0;;
        for(int i=0;i<str.length();i++){
            String sub=str.substring(i,i+1);
            if(sub.equals("x")){
                xcount++;
                xindex=i;
            }
            if(sub.equals("y")){
                ycount++;
                yindex=i;
            }
        }

        if((xcount==ycount)&&(xindex>yindex)){return false;}
        if((xcount>=ycount)&&(xindex<yindex)){return true;}
        if((xcount>ycount)&&(xindex>yindex)){return false;}
        if(xcount<ycount){return false;}
        return true;

    }

    public static void main(String[] args){
        System.out.println(strxybalance("xyyello"));
    }




}
