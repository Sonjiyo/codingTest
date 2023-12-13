class Solution {
    public long solution(int price, int money, int count) {
        long m = money;
        for(int i =1; i<=count; i++){
            m -= price*i;
        }
        long answer = m<0 ? m*-1 : 0;

        return answer;
    }
}