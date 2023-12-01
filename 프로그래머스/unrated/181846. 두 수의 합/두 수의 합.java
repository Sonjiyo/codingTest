class Solution {
    public String solution(String a, String b) {
        
        int size = a.length() > b.length()? a.length() : b.length();
		int gap = Math.abs(a.length() - b.length()); 
		String big = a.length() == size? a: b;
		String small = a.length() ==size? b: a;
		
		int[] result = new int[size];
		for(int i =0; i < size;i+=1) {
            
			int sum = result[size-1-i];
			sum += (int)big.charAt(size-1-i)-'0';

			if(i < size - gap) {

				sum += (int)small.charAt(size-1-i-gap)-'0';
			}

			if(i < size-1) {
				result[size-1-i] = sum %10;
				result[size-1-i-1] = sum/10;
			}else {
				result[size-1-i] = sum;
			}
		}
        String answer = "";
        for(int r : result){
            answer+=r+"";
        }
        return answer;
    }
}