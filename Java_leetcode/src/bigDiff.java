
public class bigDiff {
    public static int bigDiff(int[] nums) {
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return (max-min);
    }
    public static void main(String[] args){
        int[] arr={6,2,3,6,5,2};
        System.out.println(bigDiff(arr));
    }

}
