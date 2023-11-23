class Solution {
    public String solution(String myString) {
        for(int i =0; i<myString.length(); i++){ //toUpperCase()를 사용하지 않은 풀이
           if(myString.charAt(i)>='a' && myString.charAt(i)<='z'){
               int a =  (int)myString.charAt(i)-32; //소문자와 대문자의 아스키코드값 차이는 32
               myString= myString.replace(myString.charAt(i),(char)a); //chara로 값 교체
           }
       }
        
        //String answer = myString.toUpperCase(); //toUpperCase()를 사용한 풀이
        return myString;
    }
}