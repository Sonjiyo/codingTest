class Solution {
    public int solution(int n, int m, int[] section) {
        int paint = 0;
        int cnt = 0;
        
        for(int i =0; i<section.length; i++){
            if(paint<section[i]) {
                paint = section[i]+m-1;
                cnt++;
            }
        }
        return cnt;
    }
}