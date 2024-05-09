import java.util.Map;
import java.util.HashMap;

public class mapBully{

    public static void main(String[] args){
        //HashMap<String, Integer>people=new HashMap<String, Integer>();
        HashMap<String, String>map=new HashMap<String, String>();


        /*// Add keys and values
        people.put("John",32);
        people.put("Jon",3);
        people.put("Jhn",3);
*/
        map.put("icecream","peas");
        map.put("pancake","syrup");
/*
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }

 */
        for (String i : map.keySet()) {
            System.out.println("Key: " + i + "Value: " + map.get(i));
        }
        if(map.containsKey("ice cream")){
            map.put("bread","butter");
            map.put("ice cream","cherry");
        }
        for (String i : map.keySet()) {
            System.out.println("Key: " + i + "Value: " + map.get(i));
        }

    }

}
