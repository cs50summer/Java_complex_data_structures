import java.util.Map;
import java.util.HashMap;

public class maptopping1 {
    public static Map<String, String> maptopping(Map<String, String> map) {

        if(map.containsKey("ice cream")){
            map.put("bread","butter");
            map.put("ice cream","cherry");
            return map;
        }
        else{
            map.put("bread","butter");
        }
        return map;
    }

    public static void main(String[] args){
        HashMap<String,String>map=new HashMap<String,String>();

        // Add keys and values
        map.put("icecream","peas");
        map.put("pancake","syrup");
        for (String i : map.keySet()) {
            System.out.println( i +" " + map.get(i));
        }

        maptopping(map);

        for (String i : map.keySet()) {
            System.out.println( i +" " + map.get(i));
        }
    }

}
