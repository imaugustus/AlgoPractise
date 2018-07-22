package Solution.Integer;

public class PlusOne {
    private static int[] PlusOne(int [] digits){
        boolean over = true;
        int i = digits.length-1;
        while(over&&i>=0){
            if(digits[i]<9){
                digits[i] = digits[i] +1;
                over=false;
            }
            else{
                digits[i] = 0;
            }
            i--;
        }
        if(digits[0]==0){
            int []res = new int[digits.length+1];
            res[0] = 1;
            for(int j = 0; j< digits.length; j++){
                res[j+1] = digits[j];
            }
            return res;
        }
        else{
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] test = {9,9,9,9,9,};
        int[] res = PlusOne(test);
        for (int j:
             res) {
            System.out.println(j);
        }
        System.out.println("Hello");
    }
}
