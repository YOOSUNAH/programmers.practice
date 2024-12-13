package codeKata.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class num_56 {
    // 과일 장수
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        solution2(k, m, score);
    }

//    public static int solution(int k, int m, int[] score) {
//        int answer = 0;
//        // int -> List
//        List<Integer> scoreAry = Arrays.stream(score).boxed().collect(Collectors.toList());
//        Collections.sort(scoreAry);
//        List<Integer> mAry = new ArrayList<>();
//        int count = 0;
//        int min = 0;
//        if (scoreAry.size() >= m) { // m 이하면 안돼
//            for (Integer scoreIn : scoreAry) {
//                while (!(count <= m)) {
//                    for (int i = 0; i < m; i++) {
//                        mAry.add(scoreIn); // 한 상자
//                        scoreAry.remove(scoreIn);
//                        count++;
//                    }
//                    min = mAry.get(0); // 최저값 구하기
//                    for (int j = 1; j < mAry.size(); j++) {
//                        if (min > mAry.get(j)) {
//                            min = mAry.get(j);
//                        }
//                    }
//                    answer += min * m;
//                    count = 0;
//                } break;
//            }
//        }
//        System.out.println(answer);
//        return answer;
//    }
    public static int solution2(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 배열을 우선 정렬

        for(int i = score.length; i >= m; i -= m){ // 길이에서 한개씩 내려오네,
        answer += score[i - m] * m;
    }
        System.out.println("solution2 : " + answer);
        return answer;
}
}
