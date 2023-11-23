class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while(true){
            int cnt = 0;
            for(int i =0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0) {
                    arr[i]/=2;
                } else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i]*=2+1;
                } else {
                    cnt+=1;
                }
            }
            if(cnt==arr.length) break;
            count+=1; 
        }
        if(count>=2) count+=1;
        return count;
    }
}