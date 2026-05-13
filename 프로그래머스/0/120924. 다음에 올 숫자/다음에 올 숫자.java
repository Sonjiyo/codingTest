class Solution {
    public int solution(int[] common) {
        int num1 = common[0];
        int num2 = common[1];
        int num3 = common[2];
        
        int answer = 
        num2-num1 == num3-num2 ? common[common.length-1]+num2-num1 :
        common[common.length-1]*(num2/num1);
        
        return answer;
    }
}