class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        
        for(int i =0; i<query.length; i++){
            int[] copy = arr;
           if(i%2!=0){
               if(query[i]==0) continue;
        	   int leng = arr.length-query[i];
        	   
        	   arr = new int[leng];
        	   
        	   for(int j=copy.length-1; j-query[i]>=0; j--){
        		   arr[j-query[i]] = copy[j];
        	   }
           } else{
        	   int leng = arr.length-(arr.length-query[i]-1);
        	   
        	   arr = new int[leng];
        	   
        	   for(int j=0; j<arr.length; j++){
        		   arr[j] = copy[j];
        	   }
           }
        }
        return arr;
    }
}