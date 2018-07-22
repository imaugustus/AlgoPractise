package Solution.DynamicProblem;

public class MaxProductSubArray {
    public int MaxProductSubArray(int[] nums) {
        int maxSofar=nums[0], maxEndhere = nums[0], minEndhere=nums[0];
        for(int i=1; i<nums.length; i++){
            int maxCpy = maxEndhere;
            maxEndhere = Math.max(maxEndhere*nums[i],Math.max((nums[i]), minEndhere*nums[i]));
            minEndhere = Math.min(maxCpy*nums[i],Math.min((nums[i]), minEndhere*nums[i]));
            maxSofar = Math.max(maxEndhere, maxSofar);
        }
        return maxSofar;
    }
}

//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
//https://blog.csdn.net/linhuanmars/article/details/39537283
//https://en.wikipedia.org/wiki/Maximum_subarray_problem
