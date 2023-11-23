class Solution {
    public String[] solution(String[] str_list) {
        String a = "";
        int cnt = 0;
        for(int i =0; i<str_list.length; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                a = str_list[i];
                break;
            }
            cnt+=1;
        }
        
        String[] answer = {};
        if(a.equals("l")){
            if(cnt!=0){
                answer = new String[cnt];
                for(int i =0; i<answer.length; i++){
                    answer[i] = str_list[i];
                } 
            }
        } else if (a.equals("r")){
            if(str_list.length-cnt-1!=0){
                answer = new String[str_list.length-cnt-1];
                int idx = str_list.length-1;
                for(int i =answer.length-1; i>=0; i--){
                    answer[i]=str_list[idx];
                    idx-=1;
                }
            }
        }
        return answer;
    }
}