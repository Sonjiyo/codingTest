class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        while(true){
            int[] copy = answer;
            
            count+=1;
            answer = new int[count];
            answer[count-1] = n;
            
            for(int i =0; i<copy.length; i++){
                answer[i]=copy[i];
            }
            
            if(n==1) break;
            
            if(n%2==0){
                n/=2;
            } else{
                n = 3*n+1;
            }
        }
        
        
        return answer;
    }
}