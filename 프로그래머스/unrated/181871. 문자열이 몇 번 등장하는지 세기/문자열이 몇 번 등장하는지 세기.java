class Solution {
    public int solution(String myString, String pat) {
        int num = 0;
        int cnt = 0;
        while(true){
            if(myString.indexOf(pat,num)==-1) break;

            num = myString.indexOf(pat,num)+1; 
            cnt++;
        }
        return cnt;
    }
}