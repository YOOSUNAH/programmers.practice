package Problem.num_1_100.num11_20;

public class num13_letter_length {
    //1. 편지 (문자열의 길이 구하기)
    //.length()
    class Solution {
        public int solution(String message) {
            int answer = 0;

            int len = message.length();

            answer = len * 2;

            return answer;
        }
    }
}
