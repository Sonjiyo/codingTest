class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] arr = new String[my_string.length()];
        
        for(int i=1; i<=arr.length; i++){
            arr[i-1] = my_string.substring(0,i);
        }
        int answer = 0;
        for(String a : arr){
            if(a.equals(is_prefix)){
                answer=1;
            }
        }
        return answer;
    }
}