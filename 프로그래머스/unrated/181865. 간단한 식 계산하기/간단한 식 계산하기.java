class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int answer = 
            arr[1].equals("+") ? Integer.parseInt(arr[0])+Integer.parseInt(arr[2]) : 
            arr[1].equals("-") ? Integer.parseInt(arr[0])-Integer.parseInt(arr[2]) :
            Integer.parseInt(arr[0])*Integer.parseInt(arr[2]);
        return answer;
    }
}