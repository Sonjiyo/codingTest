class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum*1.0/arr.length;
    }
}