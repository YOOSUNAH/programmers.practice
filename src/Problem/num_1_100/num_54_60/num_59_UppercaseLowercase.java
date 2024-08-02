package Problem.num_1_100.num_54_60;

public class num_59_UppercaseLowercase {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for ( char x:  my_string.toCharArray()) {
                if (Character.isLowerCase(x)) {
                    answer += Character.toUpperCase(x);
                } else {
                    answer += Character.toLowerCase(x);
                }
            }
           return answer;
            }
        }

    class Solution2 { // 내가 푼 다른 풀이!!!
        public String solution(String my_string) {
            String answer = "";
            String s = "";

            char[] charArr = my_string.toCharArray();

            for (int i = 0; i < my_string.length(); i++ ){
                if (Character.isUpperCase(charArr[i])){
                     s = String.valueOf(charArr[i]);
                     answer += s.toLowerCase();
                }
                else{
                    s = String.valueOf(charArr[i]);
                    answer += s.toUpperCase();
                }
            }
            return answer;

            }
        }
    }



