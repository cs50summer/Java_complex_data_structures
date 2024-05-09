public class firstlast6 {
    public static boolean firstlast6(int[] arr){
        if(arr[0]==6 ||arr[arr.length-1]==6){
            System.out.print(arr[0]);
            System.out.print(arr[arr.length-1]);
            return true;
        }

        else {
            return false;
        }
    }


    public static void main(String[] args){
        int[] arr={6,2,3,6,5,2};
        System.out.print(firstlast6(arr));
    }
}
