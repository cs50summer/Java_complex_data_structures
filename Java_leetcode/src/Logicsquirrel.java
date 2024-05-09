public class Logicsquirrel {
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer){
            if (temp>=60 &&temp<=100){
                return true;
            }
        }
        if (temp>=60 &&temp<=90){
            return true;
        }

        return false;

    }
    public static void main(String[] args){

        System.out.print(squirrelPlay(60,false));
    }
}
