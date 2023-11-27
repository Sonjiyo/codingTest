import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        int cnt = 0;
        for(int i =0; i<arr.length; i++){
            if(!arr[i].isBlank()){
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        for(int i =0, j=0; i<arr.length; i++){
            if(!arr[i].isBlank()){
                answer[j++] = arr[i];
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}