package Problem.num_1_100.num_81_90;
// 문제
// 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
// my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
// 입출력 예
// my_string ="aAb1B2cC34oOp",	result = 37
public class num_81_hideNumber {
    public static void main(String[] args) {
       // String quiz = "aAb1B2cC34oOp";
        //Solution.solution(quiz);
    }

    static class Solution {
        public int solution(String my_string) {
            int answer = 0;
            // my_string = my_string.replaceAll("[a-zA-Z]", "");  // 숫자만 추출, 대소문자 제거
            // String[] arr = my_string.split("");

            //  String regExp = "\\D+";
            //  String[] arr = my_string.split(regExp);

             String[] arr = my_string.split("[a-zA-Z]");  // 숫자로 구분하기.
            for (String s : arr) {
                if (!s.isEmpty()) {
                    answer += Integer.parseInt(s);
                } else {
                    answer += 0;
                }
            }
            return answer;
        }
    }
}

