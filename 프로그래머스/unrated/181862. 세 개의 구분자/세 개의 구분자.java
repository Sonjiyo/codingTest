class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[a-c]");
        int cnt = 0;
        for(String a : arr){
            if(!a.isEmpty()) cnt++;
        }
        String[] answer = {};
        if(cnt==arr.length){
          answer = new String[1];
            answer[0] = "EMPTY";
        } else{
          answer = new String[cnt];
        for(int i =0, j=0; i<arr.length; i++){
            if(!arr[i].isEmpty()) answer[j++] = arr[i];
        }  
        }
        
        return answer;
    }
}