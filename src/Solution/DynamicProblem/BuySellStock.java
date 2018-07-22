package Solution.DynamicProblem;

import java.util.Arrays;

public class BuySellStock {
    public static int BuySellStock(int[] prices) {
        if(prices.length==0||prices==null) return 0;
        int global =0;
        int local = 0;
        for(int i=1; i<prices.length;i++){
            local = Math.max(local+prices[i]-prices[i-1], 0);
            global = Math.max(global, local);
        }
        return global;
    }


    public static void main(String[] args) {
        int [] test = {6, 5, 9, 7, 14, 7};
        //int [] test = {2,1,2,1,0,1,2};
        int res = BuySellStock(test);
        System.out.println("");
    }
}

