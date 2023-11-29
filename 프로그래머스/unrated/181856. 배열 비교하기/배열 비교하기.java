class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(arr2.length==arr1.length){
            for(int i =0; i<arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
        }
        
        answer = sum2>sum1 ? -1 : sum1>sum2 ? 1 : answer;
        answer = arr2.length>arr1.length ? -1 : arr2.length<arr1.length ? 1 : answer;
        return answer;
    }
}