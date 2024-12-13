package codeKata.level_2;

import java.util.ArrayList;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열
//문제 설명
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
public class num_25 {

    class Solution {
        public int[] solution(int[] arr, int divisor) {

            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
          // 리스트 크기가 0인경우
            if (list.size() == 0) {
                list.add(-1);
            }
            // 리스트를 배열로 저장
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            // 오름차순으로 정렬
            Arrays.sort(answer);
            return answer;
        }
    }
}
