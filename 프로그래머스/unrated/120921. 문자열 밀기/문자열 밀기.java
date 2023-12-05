class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        while(true){
            if(answer==B.length()) {
                answer = -1;
                break;
            }
           if(A.equals(B)) break;
           
           String[] arr = A.split("");
           
           String temp = arr[arr.length-1];
           for(int i =arr.length-1; i>0; i--){
               arr[i] = arr[i-1];
           }
           arr[0] = temp;
           
           A = "";
           for(String a : arr){
               A += a;
           }
           answer++;
       }
        
        return answer;
    }
}