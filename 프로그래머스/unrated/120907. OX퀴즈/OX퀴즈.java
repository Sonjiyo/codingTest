class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int num = 0;
        for(int i =0; i<quiz.length; i++){
            String[] temp = quiz[i].split(" ");
            if(temp[1].equals("-"))num = Integer.parseInt(temp[0])-Integer.parseInt(temp[2]);
            else num = Integer.parseInt(temp[0])+Integer.parseInt(temp[2]);
            
            answer[i] = num==Integer.parseInt(temp[4]) ? "O" : "X";
        }  
        return answer;
    }
}