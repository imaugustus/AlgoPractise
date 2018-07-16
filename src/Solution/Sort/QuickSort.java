package Solution.Sort;

public class QuickSort {
    private static void quickSort(int[] nums){
        int lo = 0;
        int hi = nums.length - 1;
        quickSort(nums, lo, hi);
    }

    private static void quickSort(int[] nums, int lo, int hi){
        if(lo>=hi) return;
        int pos = partition2(nums, lo, hi);
        quickSort(nums, lo, pos-1);
        quickSort(nums, pos+1, hi);
    }
    private static int partition(int[] nums, int lo, int hi ){
        int base = nums[lo];
        int i = lo;
        int j = hi;
        while(i<j){
            while(i<j&&nums[j]>=base){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                i++;
            }
            while(i<j&&nums[i]<=base){
                i++;
            }
            if(i<j){
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i]=base;
        return i;
    }

    private static int partition2(int[] nums, int lo, int hi ){
        int base = nums[lo];
        int i = lo;
        int j = hi+1;
        while(true){
            while(nums[++i]<=base) if(i==hi) break;
            while(nums[--j]>=base) if(j==lo) break;
            if(i>=j) break;
            int temp =nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int temp = nums[j];
        nums[j] = nums[lo];
        nums[lo] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] test = {1, -3, 4, 2, 7,6, 1, 14};
        quickSort(test);
        for (int num:
             test) {
            System.out.println(num);
        }
    }
}
//https://blog.csdn.net/morewindows/article/details/6684558
//https://blog.csdn.net/it_zjyang/article/details/53406764