class Solution {
    public int solution(int[] num_list) {
        int gub = 1;
        int hap = 0;
        for(int i =0; i<num_list.length; i++){
            hap += num_list[i];
            gub *= num_list[i];
        }
        return (hap*hap)>gub ? 1 : 0;
    }
}