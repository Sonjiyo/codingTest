class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++){
            int weapon = 0;
            for(int j=1; j*j<=i; j++){
                if(j*j==i) weapon-=1;
                if(i%j==0) weapon+=2;
                if(weapon>limit) break;
            }
            weapon = weapon>limit ? power : weapon;
            answer += weapon;
        }
        return answer;
    }
}