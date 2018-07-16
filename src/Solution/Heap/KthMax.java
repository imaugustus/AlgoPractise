package Solution.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthMax {
    public static int solution(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int solution2(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num:
             nums) {
            heap.offer(num);
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test = {3,2,3,1,2,4,5,5,6};
        int res = solution(test, 3);
        System.out.println(res);
    }
}
