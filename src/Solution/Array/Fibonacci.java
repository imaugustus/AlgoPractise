package Solution.Array;

public class Fibonacci {
    public static int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++){
            int temp = a +b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int res = Fibonacci(10);
        System.out.println("Stop");
    }
}
