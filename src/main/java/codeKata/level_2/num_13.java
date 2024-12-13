package codeKata.level_2;
// 자릿수 더하기
//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

public class num_13 {

    public class Solution {
        public int solution(int n) {
            int answer = 0;

           String[] arr = String.valueOf(n).split(""); // 나누고
            for (int i = 0; i < arr.length; i++) { // 배열에 넣고
                answer += Integer.parseInt(arr[i]);  // 다 더한다.
            }
            return answer;
        }
    }

}
