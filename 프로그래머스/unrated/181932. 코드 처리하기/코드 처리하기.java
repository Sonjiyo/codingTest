class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int i =0; i<code.length(); i++){
            if((code.charAt(i)=='1')){
                mode = mode==1 ? 0 : 1;
            } else{
                if(mode==0 && i%2==0){
                ret+=code.charAt(i);
                }
                if(mode ==1 && i%2!=0){
                ret+=code.charAt(i);
                }
            }
            
        }
        String answer = "";
        answer=ret;
        if(ret.isEmpty()){
            answer = "EMPTY";
        }

        return answer;
    }
}