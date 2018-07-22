package Solution.Integer;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static List<String> FizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n;i++){
            if(i%15==0){
                res.add("FizzBuzz");
            }
            else if(i%3==0){
                res.add("Fizz");
            }
            else if(i%5==0){
                res.add("Buzz");
            }
            else{
                res.add(""+i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> res = FizzBuzz(50);
        System.out.println("");
    }
}
