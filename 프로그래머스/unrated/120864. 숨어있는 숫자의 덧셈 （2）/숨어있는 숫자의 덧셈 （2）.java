class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]"," ").trim();
        int answer = 0;
        if(!my_string.isEmpty()){
            String[] arr = my_string.split("[ ]+");
            
            for(int i = 0; i<arr.length; i++){
                answer+=Integer.parseInt(arr[i]);
            }
        }
        
        
        return answer;
    }
}