package codeKata.level_2;
// 핸드폰 번호 가리기

public class num_27 {
    class Solution {
        public String solution(String phone_number) {
            String answer = "";

             String[] arr = phone_number.split("");
            for (int i = 0; i < arr.length - 4; i++) {
                answer += "*";
            }
            for (int i = arr.length - 4; i < arr.length; i++) {
                answer += arr[i];
            }
            return answer;
        }
    }
}
