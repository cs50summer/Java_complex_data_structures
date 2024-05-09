public class MergeSort {
    public static void main(String[] args){
        int[] ary={2,5,7,8,2,1,3,9};
        //System.out.print(mergeSort(ary));

    }
    static void mergeSort(int[] ary){
        mergeSort(ary,0,ary.length-1);
    }
    static void mergeSort(int[] ary, int start , int end){
        //is start becomes equal to end ther eis only one elememnt that is sorted , so go back
        if(start<end) {
            int mid = (start + end) / 2; // to avoid overflow if length is too big is this tehnique -- start+((end-start)/2)
            //call it two times , one on the right and one on the left
            //index element is different from length
            mergeSort(ary, 0, mid);
            mergeSort(ary, mid + 1, end);

            merge(ary,start, mid,end);
        }
    }

    static void merge(int[] ary, int start ,int mid, int end ){
        int[] leftArray=new int[mid+1-start];
        int[] rightArray=new int[end-mid];

        //Copy the sorted arrays to temp array and tehn merge results in original array
        for(int i=0;i<leftArray.length;i++){
            leftArray[i]=ary[start+i]; //copy the original sorted array to temp arrays

        }
        for(int i=0;i<rightArray.length;i++){
            rightArray[i]=ary[mid+1+i];//copy the original sorted array to temp again
        }

        int leftIdx=0;
        int rightIdx=0;
        while(leftIdx<leftArray.length && rightIdx<rightArray.length){
            if(leftArray[leftIdx]<=rightArray[rightIdx]){
                ary[start]=leftArray[leftIdx];
                start++;
                leftIdx++;
            }
            else{
                ary[start]=rightArray[rightIdx];
                start++;
                rightIdx++;

            }

        }
        //copy for remaining left
        if(leftArray[leftIdx]<=rightArray[rightIdx]){
            ary[start]=leftArray[leftIdx];
            start++;
            leftIdx++;
        }
        //copy for remaining right
        else{
            ary[start]=rightArray[rightIdx];
            start++;
            rightIdx++;

        }

    }
}
