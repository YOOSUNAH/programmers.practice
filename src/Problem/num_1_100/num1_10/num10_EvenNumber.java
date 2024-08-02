package Problem.num_1_100.num1_10;

public class num10_EvenNumber {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 0; i < n+1; i+=2)
                answer += i;

            return answer;
        }
    }
}
