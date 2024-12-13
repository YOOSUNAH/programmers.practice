package codeKata.level_2;
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
public class num_14 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] intArr;
            for (int i = 0; i < n; i++) {
                if (n % (i+1) == 0){
                    answer += (i+1);
                }
            }
            return answer;
        }
    }
}
