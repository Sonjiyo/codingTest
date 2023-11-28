import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i =1, j=0; i<arr.length; i++){
           if(j>=0 && arr[i]==list.get(j)){
               list.remove(j);
               j--;
               continue;
           }
           list.add(arr[i]);
           j++;
       }
        int[] answer = {};
        if(list.size()==0){
            answer = new int[]{-1};
        } else{
            answer = new int[list.size()];
            for(int i =0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}