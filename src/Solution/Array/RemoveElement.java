package Solution.Array;

class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                continue;
            }
            nums[j]=nums[i];
            j++;
        }
        return j;
    }
    public static void main(String[] args) {
        int[] test = {1, 3, 3, -2, 5, 5, 6, 9, 3, 1};
        System.out.println(removeElement(test, 3));
    }
}