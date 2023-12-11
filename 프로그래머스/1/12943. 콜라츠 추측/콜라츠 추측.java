class Solution {
    public int solution(long num) {
        int cnt = 0;
        while(true){
            if(num==1) break;
            num = num%2==0 ? num/=2 : num*3+1;
            cnt++;
        }
        return cnt>=500 ? -1 : cnt;
    }
}