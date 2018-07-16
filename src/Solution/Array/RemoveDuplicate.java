package Solution.Array;

class RemoveDuplicate{
    public static int Solution(int[] nums){
        if(nums==null)return 0;
        if(nums.length==1)return 1;
        int pos = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[pos]){
                nums[++pos]=nums[i];
            }
        }
        return pos + 1;
    }
    public static void main(String[] args) {
        int[] test = {1, 3, 3, 9, 9, 9, 10};
        int result = Solution(test);
        System.out.println(result);
        
    }
}