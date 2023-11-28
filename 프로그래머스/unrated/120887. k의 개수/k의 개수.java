class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for(int num = i; num<=j; num++){
            int a = num;
            while(a!=0){
    	        cnt += a%10==k ? 1 : 0;
    	        a/=10;
            }
        }
        return cnt;
    }
}