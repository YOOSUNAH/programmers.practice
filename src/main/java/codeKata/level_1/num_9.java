package codeKata.level_1;
// 짝수의 합
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
public class num_9 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if ((n - i)% 2 == 0){
                answer +=  (n - i);
            }
        }
            return answer;
    }
}
