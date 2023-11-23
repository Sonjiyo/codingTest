class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        int count = 0;
        int idx = 0;
        for (int i = l; i <= r; i += 1) {
            int[] copy = answer;
			if(i%5!=0) {
				continue;
			}
			boolean pass = false;
			String a = Integer.toString(i);
			for(int j =0; j<a.length(); j++) {
				if(a.charAt(j)=='5' || a.charAt(j)=='0') {
					pass = true;
				}
			}
			for(int j =0; j<a.length(); j++) {
				if(a.charAt(j)!='5' && a.charAt(j)!='0') {
					pass = false;
				}
			}
			if(pass) {
                count+=1;
                answer= new int[count];
                
				answer[count-1]=i;
                for(int k =0; k<copy.length; k++){
                    answer[k]=copy[k];
                }
			}
		}
        if(count==0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}