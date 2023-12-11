class Solution {
    public long solution(long n) {
        String num = n+"";
        String[] arr= num.split("");
        
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(Integer.parseInt(arr[i])>Integer.parseInt(arr[j])){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        num = "";
        for(String a : arr){
            num+= a;
        }
        
        return Long.parseLong(num);
    }
}