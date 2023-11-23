class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i =0; i<num_list.length;){
            if(num_list[i]==1) {
               i+=1;
               continue;
            }
            num_list[i]/=2;
            answer+=1;
        }
        return answer;
    }
}