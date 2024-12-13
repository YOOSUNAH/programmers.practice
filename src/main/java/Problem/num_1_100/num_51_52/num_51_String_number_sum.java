package Problem.num_1_100.num_51_52;


public class num_51_String_number_sum {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            my_string = my_string.replaceAll("[a-zA-Z]", "");  // 숫자만 추출, 대소문자 제거

            String[] arr = my_string.split(""); // String 숫자를 String 배열로 집어넣기

            for (int i = 0; i < arr.length; i++) {
                answer += Integer.parseInt(arr[i]);
            }
            return answer;
        }
    }
}
