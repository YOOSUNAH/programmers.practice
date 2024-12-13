package codeKata.level_3;

import java.util.*;
// 푸드 파이트 대회 (int list를 String array로 변환시키기)
public class num_51 {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            List<Integer> arrL = new ArrayList<>();
            for (int i = 1; i < food.length; i++) {
                int x = (food[i] / 2);
                for (int j = 0; j < x; j++) {
                    arrL.add(i);
                }
            }
            for (int i = 0; i < arrL.size(); i++) {
                answer += arrL.get(i);
            }
            Collections.sort(arrL,Collections.reverseOrder());
            answer += "0";

            for (int i = 0; i < arrL.size(); i++) {
                answer += arrL.get(i);
            }
            // answer = arrL.toString();
            // 이렇게 하면 answer 이 [1, 2, 3, 3] 0[3, 3, 2, 1] 이런식으로 나온다!
            return answer;
        }
    }
}