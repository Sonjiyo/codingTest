class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            for(int j=i-1; j>=0; j--){
                if(s.charAt(i)==s.charAt(j)){
                    answer[i] = i-j;
                    break;
                }
            }
            answer[i] = answer[i]== 0 ? -1 : answer[i];
        }
        return answer;
    }
}