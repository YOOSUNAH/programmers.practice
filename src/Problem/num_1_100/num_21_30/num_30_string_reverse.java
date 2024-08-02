package Problem.num_1_100.num_21_30;

public class num_30_string_reverse {
    public static void main(String[] args) {

    }
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for(int i = my_string.length() - 1; i >=0; i-- ){
                answer = answer + my_string.charAt(i);
            }



            return answer;
        }
    }
}
