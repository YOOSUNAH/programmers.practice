package codeKata.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 모의고사
public class num_57 {
    public static void main(String[] args) {

        int[] answer = {1,3,2,4,2};
        int[] answer2 = {1,2,3,4,5};
        solution(answer);  // 1, 2, 3
        solution(answer2);  // 1

    }
        public static List<Integer> solution(int[] answers) {
            List<Integer> answer = new ArrayList<>();
            int[] way1 = {1, 2, 3, 4, 5};
            int[] way2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] way3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] score = {0,0,0};

            for (int i = 0; i < answers.length; i++) {
                if(answers[i] == way1[i%5])score[0]++;
                if(answers[i] == way2[i%8])score[1]++;
                if(answers[i] == way3[i%10])score[2]++;
            }

            int max = Math.max(score[0], Math.max(score[1], score[2]));

            for (int i = 0; i < score.length; i++) {
                if(max == score[i] ){
                    answer.add(i+1);
                }
            }
            Collections.sort(answer); // 정렬
            System.out.println(answer);
            return answer;
        }

}
