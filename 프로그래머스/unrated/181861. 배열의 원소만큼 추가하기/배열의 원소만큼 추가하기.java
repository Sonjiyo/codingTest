class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int a : arr){
            sum+=a;
        }
        int[] answer = new int[sum];
        int idx = 0;
        for(int a : arr){
            for(int i =0; i<a; i++){
                answer[idx] = a;
                idx++;
            }
        }
        
        return answer;
    }
}