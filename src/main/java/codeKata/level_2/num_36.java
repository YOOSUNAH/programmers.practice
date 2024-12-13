package codeKata.level_2;
// 문자열 다루기 기본
public class num_36 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            answer = s.matches("^[0-9]{4}$") ||
                     s.matches("^[0-9]{6}$");
            return answer;
        }
    }


}
