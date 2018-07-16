package Solution.DynamicProblem;

public class MaxSubArray {
    private static int solution(int[] nums){
        int length = nums.length;
        int[] subSum = new int[length];
        for (int i = 0; i < length; i++) {
            if(i==0){
                subSum[i] = nums[i];
            }
            else {
                int max = (subSum[i - 1] + nums[i]) > nums[i] ? (subSum[i - 1] + nums[i]) : nums[i];
                subSum[i] = max;
            }
        }
        int base = subSum[0];
        for (int i = 1; i < length; i++) {
            if (subSum[i]>base){
                base = subSum[i];
            }
        }
        return base;
    }

    public static void main(String[] args) {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        int res = solution(test);
        System.out.println(res);
    }
}
