class Solution {
    public int solution(String s) {
        char a = 'a';
        int cnt1 = 0;
        int cnt2 = 0;
        int answer = 0;
        for(int i =0; i<s.length(); i++){
            if(cnt1==cnt2) {
                a = s.charAt(i);
                answer++;
            }
            if(s.charAt(i)==a) cnt1++;
            else cnt2++;
        }
        return answer;
    }
}