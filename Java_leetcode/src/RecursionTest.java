import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class RecursionTest {
    static Map<String, String>map =new HashMap<>();
    static{
        map.put("at","");
        map.put("cat","");
        map.put("dog","");
        map.put("and","");
        map.put("cats","");
        map.put("sand","");
        map.put("mash","");
        map.put("map","");
        map.put("ash","");
        map.put("hash","");
        map.put("shah","");
        map.put("has","");//..
    }


    public static List WordCheckDict(String str){
        List<String> resultList=new ArrayList<>();
        List<String> myres=new ArrayList<>();
        //String[] myres=new String[12];
        return(WordCheckDict(str,0,resultList,myres));
    }
    public static List WordCheckDict(String str,int start, List<String>resultList, List<String> myres){


        if(start == str.length()) {
            //To do ----
            // compare result list to the given map Only if the word is n the Map , print it out
            for(int i=0;i<resultList.size();i++) {
                if (map.containsKey(resultList.get(i))) {
                    if (!myres.contains(resultList.get(i))) {
                        myres.add(resultList.get(i));
                    }
                }
            }


           System.out.println("result: " + resultList);
            //System.out.println("my result: " + myres);
            return myres;
        }

        for(int end = start+1; end< str.length()+1; end++) {
            String subStr = str.substring(start, end);
            resultList.add(subStr);
            //if (map.containsKey(subStr)){
             //   if(!myres.contains(subStr)){
              //      myres.add(subStr);
              //  }
            //}
            WordCheckDict(str, end, resultList,myres);
            resultList.remove(resultList.size()-1); // remove last element ie backtrack

        }
        return myres;
    }


    public static void main(String[] args){
        //System.out.print(WordCheckDict("Abc"));
       System.out.print(WordCheckDict("hashmamap"));

    }
}
// one draback here in this program is that , it should have been combonation , not permutation . So may need to rewrite the powerstirng and copy it here ?