package Solution.Integer;

public class BinaryGap {
    public static int BinaryGap(int N) {
        int maxDistance=0;
        int count = 0;
        int prev = 0;
        int curr = 0;
        boolean prev_exist = false;
        while(N>0){
            count++;
            if(N%2==1&&!prev_exist){
                prev = count;
                prev_exist=true;

            }
            else if(N%2==1&&prev_exist){
                curr = count;
                maxDistance = Math.max(maxDistance, curr-prev);
                prev = curr;
            }
            N  = N/2;
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int res = BinaryGap(6);
        System.out.println("");
    }
}
