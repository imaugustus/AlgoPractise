package Solution.DynamicProblem;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    private static int solution_recursive(int n){
        if(n==1) return 1;
        else if(n==2) return 2;
        else{
            return solution_recursive(n-1) + solution_recursive(n-2);
        }
    }

    private static int solution_dp(int n){
        if(n==1) return 1;
        else if(n==2) return 2;
        else{
            int prev=2;
            int prevTwo=1;
            int result=0;
            for (int i = 3; i <=n ; i++) {
                result = prev+prevTwo;
                prevTwo = prev;
                prev = result;
            }
            return result;
        }
    }

    private static int solution_map(int n, Map<Integer, Integer> cache){
        if(n==1) {
            cache.put(1, 1);
            return 1;
        }
        else if(n==2){
            cache.put(2, 2);
            return 2;
        }
        else{
            if (cache.containsKey(n)){
                return cache.get(n);
            }
            else{
                int temp = solution_map(n-1, cache) + solution_map(n-2, cache);
                cache.put(n, temp);
                return temp;
            }
        }
    }

    public static void main(String[] args) {
        int res = solution_recursive(10);
        int res2 = solution_recursive(10);
        Map<Integer, Integer> cache = new HashMap<>();
        int res3 = solution_map(10, cache);
        System.out.println(res);
    }


}
