package Solution.Integer;
public class ReverseInteger7 {
    public int reverse(int x) {
        int reversed = 0, rest = x, mod = 0;
        while(rest!=0){
            mod = rest%10;
            rest = rest/10;
            reversed = reversed*10 + mod;
            if(reversed<Integer.MIN_VALUE||reversed>Integer.MAX_VALUE){
                return 0;
            }
        }
        reversed = reversed%10==mod?reversed:0;
        return reversed;
    }
}
//https://leetcode.com/problems/reverse-integer/discuss/132518/Accepted-Simple-Java-code

