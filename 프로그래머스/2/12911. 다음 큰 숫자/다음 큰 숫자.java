class Solution {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n); // 현재 숫자의 1의 개수
        while (true) {
            n++;
            if (Integer.bitCount(n) == targetCount) {
                break;
            }
        }
        return n;
    }
}