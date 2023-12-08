class Solution {
    public int[][] solution(int n) {
        int dir = 0;
        int num = 1;
        int[][] answer = new int[n][n];
        answer[0][0] = num;
        
        int x = 0; int y = 0;
        while(num<n*n){
			int px = x;
			int py = y;
			
            if(dir==0 && px<n-1) px+=1;
            else if(dir==1 && py<n-1) py+=1;
            else if(dir==2 && px>0) px-=1;
            else if(dir==3 && py>0) py-=1;
            
            if(answer[py][px]!=0){
                dir++;
                if(dir>3) dir=0;
            } else{
            	x=px;
            	y=py;
                num++;
                answer[y][x]=num;
            } 
        }
        
        return answer;
    }
}