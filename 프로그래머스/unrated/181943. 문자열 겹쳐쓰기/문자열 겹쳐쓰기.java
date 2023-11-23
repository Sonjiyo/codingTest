class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int size1 = my_string.length();
        int size2 = overwrite_string.length();
        
        for(int i =0; i<s; i++){
            answer+=my_string.charAt(i);
        }
        answer+=overwrite_string;
        for(int i =s+size2; i<size1; i++){
            answer+=my_string.charAt(i);
        }

        return answer;
    }
}