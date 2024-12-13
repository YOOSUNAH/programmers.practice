package codeKata.level_2;
// 정수 제곱근 판별
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요
public class num_19 {
    class Solution {
        public long solution(long n) {
            long answer = 0;
            double x = Math.sqrt(n); //
            // Math.sqrt(n) n의 제곱근
            // Math.pow(n) n의 제곱을 구하는 식
            if (x % 1 == 0){
               answer = (long)Math.pow(x+1, 2);
            }else answer = -1;
            return answer;
        }
    }

}
