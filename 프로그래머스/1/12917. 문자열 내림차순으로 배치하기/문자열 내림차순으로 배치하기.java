import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        String answer = String.valueOf(arr);
        return answer;
    }
}