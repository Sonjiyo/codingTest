class Solution {
    public String[] solution(String my_string) {
        String[] arr= my_string.split(" ");
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].isEmpty()){
                cnt++;
            }
        }
        String[] answer = new String[arr.length-cnt];
        for(int i=0, j=0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}