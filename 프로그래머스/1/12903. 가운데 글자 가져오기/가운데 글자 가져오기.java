class Solution {
    public String solution(String s) {
        int size = s.length();
        return size%2!=0 ? s.charAt(size/2)+"" : s.charAt(size/2-1)+""+s.charAt(size/2);
    }
}