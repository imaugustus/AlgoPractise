package Solution.Array;

public class NonDecreasing665 {
    public boolean checkPossibility(int[] nums) {
        int[] a = nums.clone();
        int[] b = nums.clone();
        boolean A = true;
        boolean B = true;
        for(int i = 0; i <nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                a[i] = nums[i+1];
                b[i+1] = nums[i];
                break;
            }
        }
        for(int j =0; j <nums.length-1; j++){
            if(a[j+1]<a[j]){
                A = false;
            }
            if(b[j+1]<b[j]){
                B = false;
            }
        }
        return A||B;
    }
}
