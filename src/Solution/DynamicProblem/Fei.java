package Solution.DynamicProblem;

import java.util.HashMap;

class Fei{
    public static int Solution(int n, HashMap<Integer, Integer> map){
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(map.containsKey(n)) return map.get(n);
        else{
            int result = Solution(n-1, map) + Solution(n-2, map);
            map.put(n, result);
            return result;
        }
    }

    public static int Solution2(int n){
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        else return Solution2(n-1) + Solution2(n-2);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(Solution(8, map));
        System.out.println(Solution2(8));
    }
}