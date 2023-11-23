class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer1 = x1 || x2;
        boolean answer2 = x3 || x4;
        return answer1 && answer2;
    }
}