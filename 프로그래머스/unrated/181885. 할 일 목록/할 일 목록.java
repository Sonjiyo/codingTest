class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for(boolean a : finished){
            cnt += a ? 0 : 1;
        }
        String[] answer = new String[cnt];
        
        for(int i =0, j=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[j++] = todo_list[i];
            }
            
        }
        return answer;
    }
}