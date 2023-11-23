class Solution {
    public int[] solution(int[] num_list, int n) {
        int leng = num_list.length%n==0 ? num_list.length/n : num_list.length/n+1;
        
        int[] answer = new int[leng];
        
        for(int i =0, j=0; i<num_list.length; i+=n){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}