import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i==j) continue;
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int[] answer = new int[arr.length];
        for(int i =0; i<answer.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}