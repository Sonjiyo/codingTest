class Solution {
    public int[] solution(int[] arr) {
        int leng = 1;
        while(leng<arr.length){
            leng*=2;
        }
        
        if(arr.length==1) leng = 1; //1일 경우엔 1을 남김
        int[] answer = new int[leng]; //leng만큼 길이 생성
        for(int i=0; i<arr.length; i++){
        //answer은 이미 초기값 0 이 있기에 0을 넣을 필요가 없음
            answer[i] = arr[i]; 
        }
        
        return answer;
    }
}