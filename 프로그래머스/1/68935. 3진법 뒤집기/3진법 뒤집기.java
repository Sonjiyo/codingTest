class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        return Integer.parseInt(new StringBuilder(ternary).reverse().toString(),3);
    }
}