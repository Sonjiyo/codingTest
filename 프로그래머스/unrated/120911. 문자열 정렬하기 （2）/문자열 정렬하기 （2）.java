import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        String[] arr = my_string.split("");
        Arrays.sort(arr);
        
        my_string = "";
        for(int i=0; i<arr.length; i++){
            my_string+=arr[i];
        }

        return my_string;
    }
}