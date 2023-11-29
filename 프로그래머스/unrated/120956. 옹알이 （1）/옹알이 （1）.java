class Solution {
    public int solution(String[] babbling) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(int i =0; i<babbling.length; i++){
            for(int j=0; j<baby.length; j++){
                babbling[i] = babbling[i].replace(baby[j]," ");
            }
            if(babbling[i].isBlank()){
                answer++;
            }
        }

        return answer;
    }
}