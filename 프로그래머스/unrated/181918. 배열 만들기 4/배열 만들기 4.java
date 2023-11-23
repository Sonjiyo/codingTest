class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int cnt = 0;
        for(int i =0; i<arr.length; i++){
            int[] copy = stk;
            
           if(cnt!=0 && stk[cnt-1]>arr[i]){
            	while(true) {
            		stk[cnt-1]=0;
            		cnt-=1;
            		if(cnt==0 ||stk[cnt-1]<arr[i]) break;
            	}
            }
            
            cnt+=1;
            stk = new int[cnt];
            stk[cnt-1]=arr[i];
            
            for(int j=0; j<cnt-1; j++){
                stk[j] = copy[j];
            }
            
        }
        
        return stk;
    }
}