class Solution {
    public int solution(int[][] board) {
        int size = board.length;
        
        int cnt = 0;
        for(int i =0; i<size; i++){
            for(int j=0; j<size; j++){
                boolean pass = true;
                if(board[i][j]==1) continue;
                
                for(int x = -1; x<=1; x++){
                    if(x+j<0 || x+j>=size) continue;
                    for(int y = -1; y<=1; y++){
                        if(y+i<0 || y+i>=size) continue;
                    
                        if(board[y+i][x+j] == 1) {
                            pass = false;
                            break;
                        }
                    }
                    
                }
                if(pass) cnt++;
            }
        }
        return cnt;
    }
}