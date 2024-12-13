package codeKata.level_2;

import java.util.Arrays;
import java.util.List;

// 자연수 뒤집어 배열로 만들기
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
public class num_17 {
    // 풀이1
    //class Solution0 {
    //            public int[] solution(long n) {
    //                int lNum = (int)n;
    //
    //                String[] arr = String.valueOf(lNum).split(""); // 나눠서 배열에 넣고
    //
    //                int[] intArr = new int[arr.length];
    //                int[] answer = new int[arr.length];
    //
    //                for (int i = 0; i < arr.length; i++) {
    //                  intArr[i] = Integer.parseInt(arr[i]); // String 배열을 int 배열로
    //                }
    //
    //                for (int i = 0; i < intArr.length; i++) {
    //                    answer[i] = intArr[intArr.length - i -1];  // 순서 반대로 저장
    //                }
    //                return answer;
    //            }
    //        }


    // 맞는 풀이
    class Solution {
        public int[] solution(long n) {

            String originalString = String.valueOf(n);
            StringBuilder reversedString = new StringBuilder(originalString);
            reversedString.reverse();

            String[] arr = String.valueOf(reversedString).split(""); // 나눠서 배열에 넣고

            int[] answer = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                answer[i] = Integer.parseInt(arr[i]);
            }

            return answer;
        }
    }

// 다른 풀이
class Solution2 {
    public int[] solution(long n) {
        List<String> list = Arrays.asList(Long.toString(n).split(""));
        int[] answer = new int[list.size()];

        for(int i=list.size()-1; i>-1; i--){ // 4,3,2,1,0
            System.out.println();
            answer[list.size()-1-i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}

}