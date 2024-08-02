package Problem.num_1_100.num1_10;

public class num8_divide_int_Double {
    /*
    정수 `num1`과 `num2`가 매개변수로 주어질 때, `num1`을 `num2`로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    ex) `num1`이 3, `num2`가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
     */

    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            double value = ((double)num1 / (double)num2) * 1000;
            answer = (int)value;
            return answer;


        }
    }
}
