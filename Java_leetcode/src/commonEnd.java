public class commonEnd {
    public static boolean commonEnd(int[] arr1, int[] arr2){
        if(arr1[0]==arr2[0]||arr1[arr1.length-1]==arr2[arr2.length-1]){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        int[] arr1={1,2};
        int[] arr2={3,1,3};

        System.out.print(commonEnd(arr1,arr2));
    }
}


// what is a static function vs non static function ?
// what is a mutable function vs immutable function ?