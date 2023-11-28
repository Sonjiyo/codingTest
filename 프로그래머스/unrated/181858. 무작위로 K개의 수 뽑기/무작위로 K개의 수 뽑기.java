class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i=0, j=0; i<answer.length; i++){
            if(j>=arr.length){
                answer[i] = -1;
                continue;
            }
            answer[i] = arr[j++];
            for(int m=0; m<i; m++){
                if(answer[i]==answer[m]){
                    i-=1;
                    break;
                }
            }
        }
        return answer;
    }
}