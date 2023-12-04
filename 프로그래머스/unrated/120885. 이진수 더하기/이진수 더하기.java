class Solution {
    public String solution(String bin1, String bin2) {
       int leng = bin1.length()>bin2.length() ? bin1.length() : bin2.length();
       
       String small = bin1.length()==leng ? bin2 : bin1;
       String big = bin1.length()==leng ? bin1 : bin2;
       
       int gap = big.length()-small.length();
       
       int[] arr = new int[leng];

       for(int i =leng-1; i>=0; i--){
    	   arr[i]+= (int)big.charAt(i)-'0';
    	   if(i-gap>=0) {
    		   arr[i]+= (int)small.charAt(i-gap)-'0';    		   
    	   }
    	   
           if(i!=0 && arr[i]>=2){
               arr[i-1] = arr[i-1]+1;
               arr[i] = arr[i]-2;
           }
       }
       arr[0] = arr[0]==2 ? 10 : arr[0]==3 ? 11 : arr[0];
       
       String sum = "";
       for(int a : arr){
           sum += a;
       }
        return sum;
    }
}