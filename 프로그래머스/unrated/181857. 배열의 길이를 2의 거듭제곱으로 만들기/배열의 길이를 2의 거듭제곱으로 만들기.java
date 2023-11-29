class Solution {
    public int[] solution(int[] arr) {
        int leng = 0;
        for(int i=arr.length; i>0; i++){ //거듭제곱이 아니라면 1씩 더해서 거듭제곱이 될 때까지 반복
    	   int cnt1 = 0;
    	   int cnt2 = 0;
           for(int j =i; j>1; j/=2){ //거듭제곱인지 확인
               cnt1++;
               if(j%2==0) cnt2++;
           }
            leng = i; //마지막 i를 leng에 담기
           if(cnt1!=0 && cnt1==cnt2) break;
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