class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i =0; i<common.length; i++){
            if(common[1]-common[0] == common[2]-common[1]){
                answer = common[1]-common[0]+common[common.length-1];
            } else{
                answer = common[1]/common[0]*common[common.length-1];
            }
        }
        return answer;
    }
}