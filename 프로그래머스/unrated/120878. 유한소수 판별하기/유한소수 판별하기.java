class Solution {
    public int solution(int a, int b) {
        int num = a>b ? b : a;
        for(int i =1; i<=num; i++){
            if(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        while(true){
            if(b%2!=0 || b==1) break;
            if(b%2==0) b/=2;
        }
        while(true){
            if(b%5!=0 || b==1) break;
            if(b%5==0) b/=5;
        }
        int answer = b==1 ? 1 : 2;
        return answer;
    }
}