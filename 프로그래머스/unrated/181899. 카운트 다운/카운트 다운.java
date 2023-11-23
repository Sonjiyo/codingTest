class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        
        int num = 0;
        for(int i=0; i<answer.length; i++){
            answer[i] = start-i;
        }
        return answer;
    }
}