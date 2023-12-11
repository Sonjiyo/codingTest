class Solution {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P') cnt1++;
            if(s.charAt(i)=='y' || s.charAt(i)=='Y') cnt2++;
        }
        if(cnt1!=cnt2) return false; 
        
        return true;
    }
}