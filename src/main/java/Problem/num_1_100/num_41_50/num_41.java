package Problem.num_1_100.num_41_50;

public class num_41 {
    public static void main(String[] args) {

    }
    class Solution {
        public String solution(String rsp) {
            String answer = "";
            String[] rspSplit = rsp.split("");

                for (int i = 0; i < rsp.length(); i++) {
                    if(rspSplit[i].equals("2")){
                        answer += "0";

                    }
                    else if (rspSplit[i].equals("0")) {
                        answer += "5";
                    } else if (rspSplit[i].equals("5")) {
                        answer += "2";
                    }
                }
            return answer;
        }
    }
}
