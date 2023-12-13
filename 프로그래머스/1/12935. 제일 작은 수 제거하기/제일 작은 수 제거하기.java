class Solution {
    public int[] solution(int[] arr) {
        int min = 0;
        for(int i =0, j=0; i<arr.length; i++){
            if(i==0) min = arr[i];
            if(min>arr[i]) min = arr[i];
        }
        int[] answer = new int[arr.length-1];
        for(int i =0, j=0; i<arr.length; i++){
            if(arr[i]!=min) answer[j++] = arr[i];
        }
        if(arr.length==1){
            answer = new int[]{-1};
        }
        return answer;
    }
}