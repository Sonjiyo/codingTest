class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        while(true){
            int length = s.length();
            s = s.replaceAll("0", "");
            answer[1]+=length-s.length();
            
            s = Integer.toBinaryString(s.length());
            answer[0]++;
            if(s.length()==1) break;
        }
        return answer;
    }
}