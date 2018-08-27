package Solution.Search;

class Search2DMatrix{
    public static boolean solution(int[][] matrix,int target) {
        if(matrix.length==0||matrix==null||matrix[0].length==0)return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }

    public static boolean solution2(int[][] matrix,int target) {
        if(matrix.length==0||matrix==null||matrix[0].length==0)return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int min = 0, max = col*row-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            int m = mid/col;
            int n = mid%col;
            if(matrix[m][n]==target) return true;
            else if(matrix[m][n]<target){
                min = mid + 1;
            }
            else{
                max = mid -1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] test= {{1, 3, 5}, {2, 4, 6}};
        System.out.println(solution(test, 3));
        System.out.println(solution2(test, 9));
        
    }
}