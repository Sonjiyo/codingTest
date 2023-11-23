class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] a : queries){
            for(int i =a[0]; i<=a[1]; i++){
                arr[i]+=1;
            }
        }
        return arr;
    }
}