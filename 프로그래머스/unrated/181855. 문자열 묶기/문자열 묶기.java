class Solution {
    public int solution(String[] strArr) {
        int[] arr= new int[30];
        for(int i =0; i<strArr.length; i++){
            arr[strArr[i].length()-1] ++;
        }
        int answer = 0;
        for(int a : arr){
            if(answer<a) answer = a;
        }
        return answer;
    }
}