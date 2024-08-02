package Problem.num_1_100.num_61_70;

import static Problem.num_1_100.num_61_70.num_67_answer.Solution.solution;

public class num_67_answer {
    public static void main(String[] args) {

        String my_String = "3 + 4";
        solution(my_String);
    }
    class Solution {
        public static int solution(String my_string) {
            int answer = 0;
            String[] arr = my_string.split(" ");  // 공백을 기준으로 나눈다. "3 + 5"

            answer = Integer.parseInt(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (arr[i].equals("+")) {
                    answer += Integer.parseInt(arr[i + 1]);
                    System.out.println(answer);
                }
                else if (arr[i].equals("-")) {
                    answer -= Integer.parseInt(arr[i + 1]);

                }
            }
            return answer;
        }
    }
}
