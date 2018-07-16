package StanfordAlgorithms;

public class MergeSort {
    private static int[] aux;
    private static void sort(int[] nums){
        aux = new int[nums.length];
        int lo = 0;
        int hi = nums.length - 1;
        sort(nums, lo, hi);
    }

    private static void sort(int[] nums, int lo, int hi){
        if(lo>=hi) return ;
        int mid = (lo + hi)/2;
        sort(nums, lo, mid);
        sort(nums, mid+1, hi);
        merge2(nums, lo, mid, hi);
    }

    private static void merge(int[] nums, int lo, int mid, int hi){
        int i = lo, j= mid+1;
        for(int k = lo; k<=hi; k++){
            aux[k] = nums[k];
        }
        int p = lo;
        while(i<=mid && j <= hi){
            if(aux[i]<aux[j]){
                nums[p] = aux[i];
                i++;
            }
            else{
                nums[p] = aux[j];
                j++;
            }
            p++;
        }
        if(i<mid){
            while(i<mid){
                nums[++p] = aux[i++];
            }
        }
        if(j<hi){
            while(j<hi){
                nums[++p] = aux[j++];
            }
        }
    }

    private static void merge2(int[] nums, int lo, int mid, int hi){
        int i = lo, j= mid+1;
        for(int k = lo; k<=hi; k++){
            aux[k] = nums[k];
        }
        for (int k = lo; k < hi; k++) {
            if(i>mid){
                nums[k] = aux[j++];
            }
            else if(j>hi){
                nums[k] = aux[i++];
            }
            else if(aux[i]<aux[j]){
                nums[k] = aux[i++];
            }
            else{
                nums[k] = aux[j++];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {-2, 4, 1, 1, 16, 9, 8};
        sort(nums);
        for (int i:
             nums) {
            System.out.println(i);
        }
    }
}
