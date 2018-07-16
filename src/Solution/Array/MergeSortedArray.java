package Solution.Array;

class MergeSortedArray{
    public static int[] soluiton(int[] A, int[] B) {
        int i= 0, j=0, k=0;
        int [] merged = new int[A.length+B.length];
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                merged[k++]=A[i++];
            }
            else{
                merged[k++]=B[j++];
            }
        }
        if(i<A.length){
            for ( ; i < A.length; i++) {
                merged[k++]=A[i++];
            }
        }
        else{
            for ( ; j < B.length; j++) {
                merged[k++]=B[j++];
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] testA = {1, 3, 5, 7, 9};
        int[] testB = {2, 4, 6, 8, 10};
        int[] res = soluiton(testA, testB);
        for (int ele : res) {
            System.out.println(ele);
        }

    }
}