import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        for(int i=0; i<d.length; i++){
            if(budget<=0) break;
            budget-=d[i];
            cnt++;
        }
        return budget<0 ? cnt-1 : cnt;
    }
}