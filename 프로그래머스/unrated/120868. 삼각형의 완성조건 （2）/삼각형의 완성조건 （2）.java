import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int cnt = 0;
        for(int i =0; i<=sides[1]; i++){
            if(i+sides[0]>sides[1]) cnt++;
        }
        answer += cnt;
        
        cnt= 0;
        for(int i = sides[1]+1; i<sides[0]+sides[1]; i++){
            cnt++;
        }
        answer += cnt;
        return answer;
    }
}