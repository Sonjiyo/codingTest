class Solution {
    public int[] solution(int[] arr) {
        int idx1 = -1;
        int idx2 = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                idx1 = i;
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                idx2 = i;
            }
        }
        int[] answer = new int[1];
        if(idx1 == -1){
            answer[0] = -1;
        } else{
            answer = new int[idx2-idx1+1];
            for(int i=idx1, j=0; i<=idx2; i++){
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}