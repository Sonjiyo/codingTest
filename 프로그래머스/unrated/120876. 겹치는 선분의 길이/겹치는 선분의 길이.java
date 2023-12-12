class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int i =0; i<lines.length; i++){
            for(int j=0; j<lines[i].length; j++){
                if(i==0 && j==0) {
                    max = lines[i][j];
                    min = lines[i][j];
                    continue;
                }
                if(max<lines[i][j]) max = lines[i][j];
                if(min>lines[i][j]) min = lines[i][j];
            }
        }
        
        
        for(int i =min; i<=max; i++){
            int cnt = 0;
            for(int j=0; j<lines.length; j++){
                if(lines[j][1]>i && i>=lines[j][0]) cnt++;
            }
            if(cnt>=2) answer++;
        }
        return answer;
    }
}