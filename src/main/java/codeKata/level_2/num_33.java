package codeKata.level_2;

//약수의 개수와 덧셈
//두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class num_33 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            for (int i = left; i <= right; i++) {
                int count = 0;// 13일때, 14일때, 15일때 다르니 여기서 count = 0으로 초기화 해줘야 한다.
                for (int j = 1; j <= i; j++) {
                    // 각수의 약수 구하기
                    if (i % j == 0)
                        count++;
                }

                if (count % 2 == 0)
                    answer += i;
                else
                    answer -= i;
            }
            return answer;
        }
    }
}
