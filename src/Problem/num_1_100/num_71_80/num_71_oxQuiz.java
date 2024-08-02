package Problem.num_1_100.num_71_80;


public class num_71_oxQuiz {
    public static void main(String[] args) {
//        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
//        Solution.solution(quiz);
    }

    class Solution {
        public static String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];
            String q = "";

            for (int i = 0; i < quiz.length; i++) {
                q = quiz[i];     // "3 - 4 = -3" 한개를 문자열 하나로 저장.
                String[] arr = q.split(" ");  // 공백을 기준으로 나눈다. // arr[] = "3", "-", "4", "=" ,"-1"
                String X = arr[0]; // "3"
                String Q = arr[1]; // "-"
                String Y = arr[2]; // "4"
                String Z = arr[4]; // "-3"

                int result = 0;

                if (Q.equals("+")) {
                    result = Integer.parseInt(X) + Integer.parseInt(Y);
                    if (result == Integer.parseInt(Z)) {
                        answer[i] = "O";
                    }
                    else {
                        answer[i] = "X";
                    }
                }
                if (Q.equals("-")) {
                    result = Integer.parseInt(X) - Integer.parseInt(Y);
                    if (result == Integer.parseInt(Z)) {
                        answer[i] = "O";
                    }
                    else {
                        answer[i] = "X";
                    }
                }

            }
            return answer;
        }
    }


}












