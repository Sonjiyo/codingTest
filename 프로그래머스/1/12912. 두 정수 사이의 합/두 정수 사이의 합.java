class Solution {
    public long solution(int a, int b) {
        int big = a>b ? a : b;
        int small = a>b ? b : a;
        long answer = 0;
        for(int i=small; i<=big; i++){
            answer += i;
        }
        return answer;
    }
}