package Solution.Search;

public class DivideSearch {
    public static boolean Find(int target, int[][]data){
        int length = data.length;
        int width  = data[0].length;
        int left = 0;
        int right = length*width-1;
        while(left <= right){
            int mid = (left+right)/2;
            int x = mid/width;
            int y = mid%width;
            System.out.println("data "+ x +" "+y+" "+ data[x][y]);
            if(data[x][y]==target) return true;
            else if(data[x][y]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }

    public static boolean Find1(int target, int[][]data){
        for(int i=0; i<data.length; i++){
            int left = 0;
            int right = data[0].length-1;
            while(left <= right){
                int mid = (left+right)/2;
                if(data[i][mid]==target) return true;
                else if(data[i][mid]<target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return false;
    }

    public static boolean Find2(int target, int[][]data){
        int row = data.length;
        int col = data[0].length;
        int i = row-1;
        int j = 0;
        while(i>=0&&j<col){
            if(data[i][j]==target) return true;
            else if(data[i][j]<target){
                j++;
            }
            else{
                i--;
            }
        }
        return false;
    }
    //https://www.nowcoder.com/questionTerminal/abc3fe2ce8e146608e868a70efebf62e

    public static void main(String[] args) {
        int[][] test = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find1(7, test));
        System.out.println(Find2(7, test));
        //System.out.println(Find(9, test));
        //System.out.println(Find(-12, test));
        System.out.println("STOP");
    }
}
