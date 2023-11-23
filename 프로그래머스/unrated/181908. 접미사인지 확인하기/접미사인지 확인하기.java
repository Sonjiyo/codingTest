class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] arr = new String[my_string.length()];
        int answer = 0;
        
        for(int i =0; i<arr.length; i++){
            arr[i] = my_string.substring(i);
            if(arr[i].equals(is_suffix)){
                answer=1;
                break;
            }
        }
        return answer;
    }
}