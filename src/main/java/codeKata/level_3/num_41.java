package codeKata.level_3;
// 이상한 문자 만들기
public class num_41 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split("");
            // s.toUpperCase() 대문자로
            // s.toLowerCase() 소문자로
            int index = 0;
            for (String str : arr) {
                index = (str.contains(" ") ? 0 : index + 1);  // 1, 2, 3, 0, 1, 2, (예시)
                answer += index % 2 == 0 ? str.toLowerCase() : str.toUpperCase();  // 삼항연산자로!
            }
            return answer;
        }
    }
}
