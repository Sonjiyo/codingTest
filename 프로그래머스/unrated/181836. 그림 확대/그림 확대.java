class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i =0; i<picture.length; i++){
            String data = "";
            for(int j=0; j<picture[i].length(); j++) {
    	        for(int l = 0; l<k; l++) {
    		        data += picture[i].charAt(j);
    	        }
            }
            picture[i] = data;
        }
        
        for(int i =0; i<answer.length; i++){
            answer[i] = picture[i/k];
        }
        
        return answer;
    }
}