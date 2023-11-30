class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int num = 1;
        int cnt = 0;
        int answer = 0;
        while(true) {
    	    if(cnt==3) break;
    	    for(int i = 0; i<rank.length; i++){
    		    if(rank[i] == num){
                    if(attendance[i]){
                        answer += cnt==0 ? i*10000 : cnt==1 ? i*100 : i;
                        cnt++;
                    }
    			    num++;
    			    break;
    		    }
    	    }   
        }
        
        return answer;
    }
}