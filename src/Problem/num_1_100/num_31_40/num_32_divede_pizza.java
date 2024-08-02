package Problem.num_1_100.num_31_40;

public class num_32_divede_pizza {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int n) {
            int answer = 1;
            while (true)
            {
                if ((6 * answer) % n == 0)
                    break;
                else
                    answer++;
            }
            return answer;
        }
    }
}
