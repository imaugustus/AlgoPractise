package Solution.Array;

public class MinNumberInRotateArray {
    public static int MinnNumerInRotateArray(int[] test){
        if(test.length==0) return 0;
        int minimum = test[0];
        for(int i =1; i<test.length; i++){
            if(test[i]<test[i-1]) {
                return test[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] test = {3,4,5,1,2};
        int res = MinnNumerInRotateArray(test);
        System.out.println("Stop");
     }
}
