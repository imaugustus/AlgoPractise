package Solution.DynamicProblem;

public class BuySellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices==null) return 0;
        int sum = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1]-prices[i]>0){
                sum = sum+prices[i+1]-prices[i];
            }
        }
        return sum;
    }
}
