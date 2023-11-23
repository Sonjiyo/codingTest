class Solution {
    public String solution(String my_string, int n) {
        int leng = my_string.length() - n;
        
        String answer = my_string.substring(leng);
        return answer;
    }
}