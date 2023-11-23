class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split( "" );

        for ( int index : indices ) {
            arr[index] = "";
        }

        return String.join( "", arr);
    }
}