class Solution {
    public String solution(String a, String b) {
        String sum = "";
        
        int leng = a.length()>b.length() ? a.length() : b.length();
		int gap = Math.abs(a.length()-b.length());
		String big = a.length() == leng? a: b;
		String small = a.length() == leng? b: a;

		int[] total = new int[leng];

		for(int i=leng-1; i>=0; i--) {
			total[i] += (int)big.charAt(i)-'0';
			if(gap==0 || i>=gap) {
				total[i] += (int)small.charAt(i-gap)-'0';
			}	

			if(i!=0 && total[i]>=10) {
				total[i] -= 10;
				total[i-1]+=1;
			}
			
			sum = total[i]+sum;
		}

        return sum;
    }
}