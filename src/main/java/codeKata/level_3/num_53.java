package codeKata.level_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 명예의 전당
public class num_53 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        sol(k, score);
    }
        public static int[] sol(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> arrL = new ArrayList<>();
            for (int i = 0; i < score.length; i++) {
                arrL.add(score[i]);
                arrL.sort(Collections.reverseOrder()); // 큰 순으로 정렬
                System.out.println(arrL);
                int min = arrL.get(0);
                if(arrL.size() < k){
                    min = arrL.get(arrL.size() - 1); // list에서 가장 마지막 번째 값 가져오기
                }else {
                    min = arrL.get(k - 1);
                    System.out.println(min);
                }
                answer[i] = min;
            }
            return answer;
        }
    }
