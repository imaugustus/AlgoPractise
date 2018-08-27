package Solution.Integer;

public class CountPrime {
    public static int CountPrime(int n){
        if(n<=2) return 0;
        if(n==3) return 1;
        if(n==4||n==5) return 2;
        int count = 2;
        for(int i=5;i<n;i++){
            System.out.println(Prime(i));
            count  += Prime(i);
        }
        return count;
    }

    public static int Prime(int m){
        if(m%6==1||m%6==5){
          int mid  = (int)Math.sqrt(m);
          for(int j=5; j<=mid;j+=6){
              if(m%j==0||m%(j+2)==0){
                  return 0;
              }
          }
          return 1;
        }
        else{
            return 0;
        }
    }

//    public static void main(String[] args) {
//        int res = CountPrime(10);
//        System.out.println("");
//    }
}
