package codeKata.level_3;
//시저 암호
//문제 설명
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
public class num_45 {
// 시저 암호
    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);

                if (Character.isLowerCase(sChar)) {
                    sChar = (char)((sChar - 'a' + n) % 26 + 'a');
                } else if (Character.isUpperCase(sChar)) {
                    sChar = (char)((sChar - 'A' + n) % 26 + 'A');
                }
                answer += sChar;
            }
            return answer;
        }
    }
}
