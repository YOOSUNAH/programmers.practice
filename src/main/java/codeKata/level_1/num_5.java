package codeKata.level_1;
// 숫자비교하기
public class num_5 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;

            if (num1 == num2)
                answer = 1;
            else
                answer = -1;

            return answer;
        }
    }
}
