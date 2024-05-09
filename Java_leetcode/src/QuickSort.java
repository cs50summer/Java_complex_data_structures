public class QuickSort {
    public static void main(String[] args){
        int[] ary={5,1,6,8,3,7,2};
        System.out.println("Sorted Array "+ ary);
        quickSort(ary);
        //System.out.println("Sorted Array "+ Array.toString());
    }
    static void quickSort(int[] ary){
        quickSort(ary,0,ary.length-1);

    }

    static void quickSort(int[] ary, int start , int end){
        if(start<end){
           int pivotIdx= partition(ary, start,end);//Partitions the array at pivot index , so all elements less taht pivot are on left and greater
            /*can select pivot here and pass to partition (ary, start , end , pivot
            * After partition function , all elements on left are less than pivot and all elements on right are greater that pivot */
            quickSort(ary,start,pivotIdx-1);
            quickSort(ary,pivotIdx+1,end);
        }

    }
    static int partition(int[] ary, int start, int end){
        //Select the pivot here or can also be selected in the calling function
        //Select pivot
        //select last element as pivot
        int pivot=ary[end];
        int pivotIdx=start;
        for(int j=start;j<end;j++){
            if(ary[j]<pivot){
                swap(ary,pivotIdx,j);
                pivotIdx++;
            }

        }//here we found the pivot Idx
        swap(ary,pivotIdx,end);//we found the right pklce for teh pivot
        return pivotIdx;
    }

    static void swap(int[]ary, int a , int b){
        int temp=ary[a];
        ary[a]=ary[b];
        ary[b]=temp;
    }
}
