class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[len];
        String a = "";
        
        for(int i=0, j=0; i<my_str.length();i++){
            a += my_str.charAt(i);
            answer[j] = a;
            if(i%n==n-1) {
                a = "";
                j++;
            }
        }
        return answer;
    }
}