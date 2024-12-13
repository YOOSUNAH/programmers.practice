package codeKata.level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//제일 작은 수 제거하기
//문제 설명
//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//제한 조건
//arr은 길이 1 이상인 배열입니다.
//인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

//입출력 예
//arr	return
//[4,3,2,1]	[4,3,2]
//[10]	[-1]
public class num_29 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};

            if (arr.length == 1) {
                answer = new int[] {-1};
            }
            else {
                // 배열을 -> 리스트로 만들기
                List<Integer> list = new ArrayList<>();
                for (int a : arr) {
                    list.add(a);
                }

                // Collection을 이용해서 list의 가장 작은 수 제거
                list.remove(Collections.min(list));

                // 리스트를 다시 배열로 저장하기
                answer = new int[arr.length - 1];
                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }
            }
            return answer;
        }
    }


}
