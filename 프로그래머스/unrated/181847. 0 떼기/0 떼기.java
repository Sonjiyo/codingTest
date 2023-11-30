class Solution {
    public String solution(String n_str) {
        String[] arr = n_str.split("");
        for(int i =0; i<arr.length; i++){
            if(arr[i].equals("0")){
                arr[i] = "";
            } else{
                break;
            }
        }
        n_str = "";
        for(String a : arr){
            n_str += a;
        }
        return n_str;
    }
}