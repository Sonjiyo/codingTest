class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                cnt++;
            }
        }
        String[] answer = new String[strArr.length-cnt];
        for(int i =0, j=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[j++] = strArr[i];
            }
        }
        return answer;
    }
}