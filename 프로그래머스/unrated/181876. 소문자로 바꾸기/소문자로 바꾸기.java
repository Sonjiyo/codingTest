class Solution {
    public String solution(String myString) {
        for(int i =0; i<myString.length(); i++){ //toLowerCase()를 사용하지 않은 풀이
            if(myString.charAt(i)<='Z'){ //myString은 알파벳으로만 이루어져있기 때문
                char a = myString.charAt(i);
                int lower = (int)a+32; //대문자와 소문자의 아스키코드 값 차이는 32
                myString = myString.replace(a,(char)lower);
            }
        }
        
        //myString = myString.toLowerCase(); //toLowerCase()를 사용한 풀이
        return myString;
    }
}