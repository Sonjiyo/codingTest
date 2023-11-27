class Solution {
    public int solution(String myString, String pat) {
        pat = pat.replace('A','C').replace('B','A').replace('C','B');
        int answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }
}