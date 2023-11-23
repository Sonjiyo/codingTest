class Solution {
    public String solution(String myString) {
        for(int i =0; i<myString.length(); i++){
            myString = myString.replace('a','A');
            if(myString.charAt(i)<='Z' && myString.charAt(i)!='A'){
                myString = myString.toLowerCase();
            }
        }
        return myString;
    }
}