package Solution.Heap;

public class HeapSort {
    private static void heapSort(int[] nums){
        int end = nums.length-1;
        for (int i = (end-1)/2; i >=0 ; i--) {
            sink(nums, i, end);
        }
        while(end>0){
            int tmp = nums[0];
            nums[0] = nums[end];
            nums[end] = tmp;
            end--;
            sink(nums, 0, end);
        }
    }

    private static void swim(int[] nums, int k){
        while(k>1 && nums[(k-1)/2]<nums[k]){
            int temp = nums[k];
            nums[k] = nums[(k-1)/2];
            nums[(k-1)/2] = temp;
            k = (k-1)/2;
        }
    }

    private static void sink(int[] nums, int k, int end){
        while(2*k+1<end){
            int j = 2*k+1;
            if(j<end &&nums[j]<nums[j+1]) j++;
            if(nums[k]>=nums[j]) break;
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            k = j;
        }
    }

    private static void sink(int[] nums){

    }


    public static void main(String[] args) {
        int[] nums = {2, -2, 3, 1, 6, 12, 5, 4};
        System.out.println("Before Sort");
        for (int num:
             nums) {
            System.out.println(num);
        }
        heapSort(nums);
        System.out.println("After Sort");
        for (int num:
             nums) {
            System.out.println(num);
        }

    }
}
//http://www.cnblogs.com/jwongo/p/datastructure-heap.html