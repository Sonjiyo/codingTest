class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i =0; i<my_string.length(); i++){
            int num = (int)my_string.charAt(i);
            if(num<=90 && 65<=num){
                answer[num-65] +=1 ;
            } else{
                answer[num-97+26] +=1;
            }
        }
        
        return answer;
    }
}