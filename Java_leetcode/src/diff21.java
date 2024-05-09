import static java.lang.Math.abs;

public class diff21 {
    public static int diff21(int n){
        int ab=abs(n-21);
        if(n>21){
            return 2*ab ;
        }
        else{
            return ab;
        }
    }

    public static void main(String[] args){
        System.out.print(diff21(5));
    }


}
