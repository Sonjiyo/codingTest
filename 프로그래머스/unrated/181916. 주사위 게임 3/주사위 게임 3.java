class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        int answer = 0;
        
        int sum = 0;
        int cnt = 0;
        int idx = 1;
        for(int i=0; i<dice.length; i++){
            sum+=dice[i];
        }
        
        if(dice[0]!=dice[1] && dice[0]!=dice[2] && 
        		dice[0]!=dice[3] && dice[1]!=dice[2] && 
        		dice[1]!=dice[3] && dice[2]!=dice[3]){ //모두 다를 경우
            int min = dice[0];
            for(int i =0; i<dice.length; i++){
                if(min>dice[i]){
                    min = dice[i];
                }
            }
            answer = min;
        } else{
            for(int i =0; i<dice.length; i++){
               if(sum%4==0 && sum/4==dice[i]){
                    idx=0;
                } else{
                   idx=1;
                   break;
               }
            }
        }
        
        if(idx==0){ //모두 같을 경우
            answer = dice[0]*1111;
        } else if (idx==1){
            for(int i =0; i<dice.length; i++){
                for(int j =0; j<dice.length; j++){
                    if(i!=j && dice[i]==dice[j]){
                        cnt+=1; 
                        idx = i;
                    }
                }
            }
        }
        
        if(cnt==6){ //3개만 같을 경우
            int num = sum-dice[idx]*3;
            answer = (10*dice[idx]+num)*(10*dice[idx]+num);
        } else if(cnt==4) {
            cnt=0;
            answer = (sum/2-dice[idx]+dice[idx])*(sum/2-dice[idx]-dice[idx]);
            if(answer<0){
                answer*=-1;
            }
        } else if(cnt!=0){ //2개만 같을 경우
            answer=1;
            for(int i =0; i<dice.length; i++){
                if(dice[i]!=dice[idx]){
                    answer*=dice[i];
                }
            }
        }
        
        
        return answer;
    }
}