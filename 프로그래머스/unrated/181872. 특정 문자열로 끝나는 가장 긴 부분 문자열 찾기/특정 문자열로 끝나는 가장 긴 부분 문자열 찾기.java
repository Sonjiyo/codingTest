class Solution {
    public String solution(String myString, String pat) {
        int idx = 0;
        
        for(int i =0; i<myString.length(); i++){
            int cnt = 0;
            if(myString.charAt(i)!=pat.charAt(0))continue;
            
            if(pat.length()!=1 && i>myString.length()-pat.length()) continue;
            
            for(int j = 0; j<pat.length(); j++){
                if(myString.charAt(i+j)==pat.charAt(j)){
                    cnt+=1;
                }
            }
            if(cnt==pat.length()) idx = i+pat.length();
        }
        String answer = "";
        for(int i =0; i<idx; i++){
            answer+=myString.charAt(i);
        }
        
        return answer;
    }
}