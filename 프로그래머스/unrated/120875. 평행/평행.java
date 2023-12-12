class Solution {
    public int solution(int[][] dots) {
        int[] x = new int[2];
        int[] y = new int[2];
        
        for(int i=0; i<dots.length; i++){
            x[0] = dots[3][0]-dots[i][0];
            x[1] = dots[(i+1)%3][0]-dots[(i+2)%3][0];
            y[0] = dots[3][1]-dots[i][1];
            y[1] = dots[(i+1)%3][1]-dots[(i+2)%3][1];
            
            if(y[0]*1.0/x[0]==y[1]*1.0/x[1]){
                return 1;
            }
        }

        return 0;
    }
}