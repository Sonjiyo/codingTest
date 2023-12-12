import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i =0; i<10; i++){
            boolean check = true;
            for(int j=0; j<numbers.length; j++){
                if(i==numbers[j]){
                    check = false;
                }
            }
            if(check) answer+=i;
        }
        
        return answer;
    }
}