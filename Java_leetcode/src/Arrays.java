import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arrays {
static class Interval {int start;
int end;
Interval(int start , int end){
    this.start=start;
    this.end=end;}
}
public String toString(){
    String start;
    String end;
    return "[start=" +start +",end=" +end + "]";
}
}

public static void main(String[] args){
    Interval int1=new Interval(1,3);
    Interval int2=new Interval(2,6);
    Interval int3=new Interval(8,10);
    Interval int4=new Interval(15,18);
    
    List<Interval> intervalList =new ArrayList<>();
    intervalList.add(int1);
    intervalList.add(int2);
    intervalList.add(int3);
    intervalList.add(int4);
    
    System.out.println("before merge:"+intervalList);
    List<Interval>mergedIntervallist =merge(intervalList);
    String mergedIntervalList;
    System.out.println("after merge:" + mergedIntervalList);
}

private static List<Interval> merge(List<Interval> intervalList){
    Collections.sort(intervalList,(obj1, obj2) -> {return obj1.start - obj2.start;});
    
    Interval intv=intervalList.get(0);

    Interval currIntv = null;
    List<Interval> resultIntervals = null;
    for(int i = 1; i<intervalList.size(); i++){
        Interval intv=intervalList.get(i);
        
        if(intv.start<=currIntv.end){
            currIntv =newInterval(currIntv.start, Math.max(currIntv.end,intv.end));
        }else{
            resultIntervals.add(currIntv);
            currIntv = new Interval(intv.start , intv.end)
        }
        }//end for loop 
    //there is always a pointer at the end , where the last one os not added at all 
    resultIntervals.add(currIntv); //process the last element 
    return resultIntervals;
    }

    private static Interval newInterval(int start, int max) {
    }
}
