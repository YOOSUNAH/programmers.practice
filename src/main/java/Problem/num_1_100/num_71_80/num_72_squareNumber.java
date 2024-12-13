package Problem.num_1_100.num_71_80;

import static Problem.num_1_100.num_71_80.num_72_squareNumber.Solution.solution;


public class num_72_squareNumber {
    public static void main(String[] args) {
        int n = 144;
        solution(n);
    }

    class Solution {
        public static int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (i * i == n) {
                    answer = 1;
                    break;   // break를 해야 제곱수를 구한 다음에 다시 다음수로 제곱수인지 판단하고 anwer =2로 바뀌지 않는다.
                 } else {
                    answer = 2;
                }
            }

            return answer;
        }
    }



    class Solution2 {
        public static int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (i * i == n) {
                    answer = 1;
                }
            }

            if (answer != 1) {
                answer = 2;
            }
            return answer;
        }
    }



}
