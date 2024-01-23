class Solution {
    public int solution(int[] number) {
        int cnt = 0;
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length; j++){
                if(i==j) continue;
                int sum = number[i] + number[j];
                for(int k=0; k<number.length; k++){
                    if(k==i || k==j) continue;
                    if(sum==number[k]*-1) cnt++;
                }
            }
        }
        return cnt/6;
    }
}