package Problem.num_1_100.num_41_50;

import java.util.Arrays;

public class num_50_sort_String {

    private String name;

    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(String my_string) {

//           my_string = my_string.replaceAll("[^0-9]", "");
//
//           for (int i =0; i < my_string.length(); i++){
//               answer[i] =  my_string.charAt(i) - '0'; // 아스키코드값에서 48을 ('0')을 빼줘야 실제 정수를 가리킨다.
//           }

//            Arrays.sort(answer);

            my_string = my_string.replaceAll("[a-z]", "");  // 숫자만 추출

            String[] arr = my_string.split(""); // String 숫자를 String 배열로 집어넣기
            int[] answer = new int[arr.length]; // int[] answer = {}; 왜 이게 아니라 길이를 제한해줘야지?


            for (int i = 0; i < arr.length; i++) {
                answer[i] = Integer.parseInt(arr[i]); //String 배열을  int 배열로 집어 넣기
            }
            Arrays.sort(answer); // 오름차순으로 정렬하기

            return answer;
        }

    }
}
