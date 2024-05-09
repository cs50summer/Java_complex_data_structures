import java.util.Map;
import java.util.HashMap;

public class mapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){
            String value1=map.get("a");
            String value2=map.get("b");

            map.put("ab",value1+value2);
            for (String i : map.keySet()) {
                System.out.println("key:" + i + " value:" + map.get(i));
            }

        }

        return map;
    }

    public static void main(String[] args){
        HashMap<String,String>map=new HashMap<String,String>();

        // Add keys and values
        map.put("a","Hi");
        map.put("b","There");
        for (String i : map.keySet()) {
            System.out.println( i +" " + map.get(i));
        }

        mapAB(map);

    }

}
