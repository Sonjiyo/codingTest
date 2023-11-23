class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int idx = 0;
        switch(n){
            case 1 : 
                answer = new int[slicer[1]+1];
                for(int i = 0; i<=slicer[1]; i++){
                    answer[idx] = num_list[i];
                    idx+=1;
                }
                break;  
            case 2 :
                
                answer = new int[num_list.length-slicer[0]];
                for(int i = slicer[0]; i<num_list.length; i++){
                answer[idx] = num_list[i];
                    idx+=1;
                }
                break;
            case 3 :
                
                answer = new int[slicer[1]-slicer[0]+1];
                for(int i = slicer[0]; i<=slicer[1]; i++){
                    answer[idx] = num_list[i];
                    idx+=1;
                }
                break;
                
             case 4 :
                //2-9 23456789 > 2 4 6 8
                //2-8 2345678 > 2 4 6 8
                //2-8 2345678 > 2 5 8
                //2-10 2345678910 > 2 5 8
                int size = 0;
                if((slicer[1]-slicer[0]+1)%slicer[2]==0){
                    size = (slicer[1]-slicer[0]+1)/slicer[2];
                } else {
                    size = (slicer[1]-slicer[0]+1)/slicer[2]+1;
                }
                answer = new int[size];
                for(int i = slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    answer[idx] = num_list[i];
                    idx+=1;
                }
                break;
        }
        return answer;
    }
}