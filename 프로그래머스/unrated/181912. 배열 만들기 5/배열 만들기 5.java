class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String num = "";
        int cnt = 0;
        for(int i =0; i<intStrs.length; i++){
            num="";
           for(int j =s; j<s+l; j++){
                num += intStrs[i].charAt(j)+"";
            } 
            if(Integer.parseInt(num)>k){
                cnt+=1;
            }
        }
        
        int[] answer = new int[cnt];
        
        
        int idx = 0;
        for(int i =0; i<intStrs.length; i++){
            num = "";
           for(int j =s; j<s+l; j++){
                num += intStrs[i].charAt(j)+"";
            } 
            if(Integer.parseInt(num)>k){
                answer[idx]=Integer.parseInt(num);
                idx+=1;
            }
        }
        
        return answer;
    }
}