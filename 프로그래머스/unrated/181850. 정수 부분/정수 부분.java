class Solution {
    public int solution(double flo) {
        String str = flo+"";
        String[] arr = str.split("[.]");
        
        return Integer.parseInt(arr[0]);
    }
}