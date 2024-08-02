package Problem.num_1_100.num_61_70;

import java.util.Arrays;

public class num_62_oneTimeAppear {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split("");
            int count = 0;

            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++){
                count =0;  //   "abcabcadc" arr[0]-> arr[1]로 변경하면 count를 다시 리셋해주어야함.

                for (int j = 0; j < arr.length; j++){
                    if (arr[i].equals(arr[j])){   // "abcabcadc" arr[0] vs  arr[0, 1, 2, 3, 4] 과 비교
                        count ++;                 // 같으면 count 더해줌.  (자기자신과도 비교하니 자기자신과 같으면 1, 다른위치의 문자와도 같으면 2, 3)
                       }
                }
                if (count == 1){         // 한번 등장 (자기자신과 비교하였을 때 한번 1뿐이어야 함)
                    answer += arr[i];
                }
            }
            return answer;
        }
    }




    class Solution2 {
        public String solution(String s) {
            String answer = "";
            int count = 0;

            String[] arr = s.split("");
            String[] ANSWER = new String[arr.length];


            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length; j++){
                    if (arr[i] == arr[j]){
                        count ++;
                        if (count == 1){
                            ANSWER[i] = arr[i];
                        }
                        else break;
                    }else break;
                }
            }

           Arrays.sort(ANSWER);
           answer = String.join("", ANSWER);

            return answer;
        }
    }
}
