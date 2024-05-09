import java.util.ArrayList;
import java.util.List;

public class Powerstringtest {
    public static void powerstringtest(String str,int start,List<String> resultList ){

        if(start==str.length()){
            System.out.println(" : "+resultList);
            return;
        }
        for(int end=start+1 ; end<str.length()+1;end++){
            String substring=str.substring(start,end);
            resultList.add(substring);
            powerstringtest(str,end,resultList);
            resultList.remove(resultList.size()-1);
        }
    }

    public static void main(String[] args){
        String str="hello";
        List<String> resultList=new ArrayList<>();
        powerstringtest(str,0,resultList);
    }
}
