class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int idx = -1;
        for(int i =0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])) {
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            answer = "fail";
        } else{
            answer = db[idx][1].equals(id_pw[1]) ? "login" : "wrong pw";
        }
        
        return answer;
    }
}