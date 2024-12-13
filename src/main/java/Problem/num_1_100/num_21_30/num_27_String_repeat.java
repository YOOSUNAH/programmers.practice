package Problem.num_1_100.num_21_30;

public class num_27_String_repeat {
    public static void main(String[] args) {

    }
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                for (int j = 0; j < n; j++) {
                    answer += my_string.charAt(i);
                }
            }
            return answer;
        }
    }
}




