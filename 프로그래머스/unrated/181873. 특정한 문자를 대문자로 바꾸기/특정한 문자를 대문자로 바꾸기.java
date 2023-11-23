class Solution {
    public String solution(String my_string, String alp) {
        for(int i =0; i<my_string.length(); i++){
            if(alp.equals(my_string.charAt(i)+"")){
                my_string = my_string.replace(my_string.charAt(i),(char)((int)my_string.charAt(i)-32));
            }
        }
        return my_string;
    }
}