class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = -1000;
        int sum = total==0 ? -1 : 0;
        while(true){
            if(sum==total) break;
            sum = 0;
            for(int i =n, j=0; j<answer.length; i++){
                answer[j] = i;
                sum += answer[j++];
            }
            n++;
        }
        
        return answer;
    }
}