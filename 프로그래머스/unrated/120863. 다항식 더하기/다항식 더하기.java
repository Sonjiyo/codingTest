class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
       
       int sum = 0;
       int sumX = 0;
       for(int i =0; i<arr.length; i++){
           char a = arr[i].charAt(arr[i].length()-1);
           
           if(a=='x'){
               String[] array = arr[i].split("x");
               sumX += array.length==0 ? 1 : Integer.parseInt(array[0]);
           } else if(a!='+'){
               sum += Integer.parseInt(arr[i]);
           }
       }
       String answer = sumX==0 ? "" : sumX==1 ? "x" : sumX+"x";
        answer += sum!=0 && sumX!=0 ? " + " : "";
        answer += sum==0 ? "" : +sum;
        return answer;
    }
}