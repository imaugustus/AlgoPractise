package Solution.Array;

import java.lang.Math;

class MaximumSubarray{
    public static int solution(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int global = nums[0], local = nums[0];
        for (int i = 0; i < nums.length; i++) {
            local = Math.max(nums[i], nums[i]+local);
            global = Math.max(global, local);
        }
        return global;       
    }

    public static void main(String[] args) {
        int[] test = {-1, -3, 4, 5, 1, 0,-3,12, -5};
        int res = solution(test);
        System.out.println(res);
    }
}