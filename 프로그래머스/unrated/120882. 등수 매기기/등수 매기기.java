class Solution {
    public int[] solution(int[][] score) {
        int size = score.length;
        int[] answer = new int[size];
        for(int i =0; i<size; i++){
            answer[i] = 1;
            for(int j=0; j<size; j++){
                if(score[j][0]+score[j][1]>score[i][0]+score[i][1]){
                    answer[i] ++;
                }
            }
        }
        return answer;
    }
}