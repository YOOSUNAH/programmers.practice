package Problem.num_1_100.num_61_70;

import java.util.Arrays;

public class num_61_changeIndex {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";

            String[] arr = my_string.split("");

            String NUM1 = arr[num1]; // 값이 num2로 바뀔테니 따로 저장해뒥
            arr[num1] = arr[num2];  // 바꿔주기.
            arr[num2] = NUM1;       // num2 도 변경전 arr[num1]로 변경해주기

            answer = String.join("", arr);

            return answer;
        }
    }

    class Solution2 {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            char[] arr = my_string.toCharArray();
            arr[num1] = arr[num2];
            arr[num2] = arr[num1];

            answer = Arrays.toString(arr);  // [h, l, l, l, o]
            answer = String.join(" ", String.valueOf(arr)); // hlllo

            return answer;
        }
    }


}
