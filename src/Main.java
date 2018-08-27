import Solution.DynamicProblem.SubSum;

public class Main {

    public static void main(String[] args) {
        int [] test = {-2, 0, 3, -5, 2, -1};
        SubSum ss = new SubSum(test);
        int res1 = ss.sumRange(0, 2);
        int res2 = ss.sumRange(2, 5);
        int res3 = ss.sumRange(0, 5);
        System.out.println("Stop here");
    }
}
