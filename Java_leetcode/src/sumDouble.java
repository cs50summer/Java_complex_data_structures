public class sumDouble {
    public static int sumDouble(int a , int b){
        int sum=a+b;
        if(a==b){
            return (2*sum);
        }
        else{
            return sum;
        }
    }
    public static void main (String[] args){
     System.out.print(sumDouble(4,4));
    }
}
