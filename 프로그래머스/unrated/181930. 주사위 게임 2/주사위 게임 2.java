class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        //2 2 3
        //2+2+3 =7  / 4 + 4 + 9 =17  / 8 + 8 + 27 =43      
        if(a!=b && b!=c && a!=c){
            answer = a+b+c;
        } else if(a==b && b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else{
            answer = (a+b+c)*(a*a+b*b+c*c);
        }

        return answer;
    }
}