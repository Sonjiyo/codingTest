class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i =0; i<dots.length; i++){
            for(int j=0; j<dots.length; j++){
                if(dots[i][0]!=dots[j][0] && dots[i][1]!=dots[j][1]){
                    answer = (dots[i][0]-dots[j][0])*(dots[i][1]-dots[j][1]);
                    answer = answer<0 ? answer*-1 : answer;
                }
            }
            if(answer!=0) break; 
        }
        return answer;
    }
}