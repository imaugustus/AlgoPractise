package Solution.DynamicProblem;

import java.util.ArrayList;

public class SubSum {
//    private int[] data;
//    public SubSum(int[] nums){
//        this.data = nums;
//    }
//
//    public int sumRange(int low, int hi){
//        int sum = 0;
//        for(int i=low; i<=hi; i++){
//            sum +=this.data[i];
//        }
//        return sum;
//    }
private int[] data;
    private ArrayList<Integer> sums= new ArrayList<>();
    public SubSum(int[] nums){
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
            this.sums.add(sum);
        }
    }

    public int sumRange(int low, int hi){
        if(low==0){
            return this.sums.get(hi);
        }
        else{
            return (int)this.sums.get(hi) - this.sums.get(low-1);
        }
    }
}
