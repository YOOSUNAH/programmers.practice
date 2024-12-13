package codeKata.level_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// 로또의 최고 순위와 최저 순위
public class num_61 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
//        solution(lottos, win_nums);

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
//        solution(lottos2, win_nums2);

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        solution(lottos3, win_nums3);
    }

// 처음시도
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] ranking = {6, 5, 4, 3, 2, 1};
        int count = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }
        System.out.println("zero" + zero);
        System.out.println("count" + count);
        // 순위
        answer[0] = ranking[count + zero - 1];
        System.out.println("answer[0]" + answer[0]);
        if (count == 0 || count == 1) {
            answer[1] = ranking[0];
        } else {
            answer[1] = ranking[count - 1];
        }
        System.out.println("answer[1]" + answer[1]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
// 정답
    public static int[] solution2(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        // 결과를 담을 배열, answer[0]: 최고 순위, answer[1]: 최저 순위
        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                // 최고 순위
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    // 최고 순위
                    answer[0]++;
                    // 최저순위
                    answer[1]++;
                }
            }
        }
        // 순위에 따른 등수로 변환
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    // 다른 풀이
    public int[] solution5(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for (int winNum : win_nums) {
            if (map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if (maxRank > 6) maxRank = 6;
        if (minRank > 6) minRank = 6;

        return new int[]{maxRank, minRank};
    }


        public int[] solution4(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];

            int cnt1 = 0;
            int cnt2 = 0;
            for (int i : lottos) {
                if (i == 0) {
                    cnt1++;
                    continue;
                }
                for (int j : win_nums) {
                    if (i == j) cnt2++;
                }
            }


            answer[0] = getGrade(cnt1 + cnt2);
            answer[1] = getGrade(cnt2);

            return answer;
        }

        public int getGrade(int n) {
            switch (n) {
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                default:
                    return 6;
            }
        }


    public int[] solution3(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int hidden = 0;

        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++)
            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
                answer++;
            else if (lottos[i] == 0)
                hidden++;

        return new int[]{rank[answer + hidden], rank[answer]};
    }
}


//class Solution {
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int[] rank = {6, 6, 5, 4, 3, 2, 1};
//        // 결과를 담을 배열, answer[0]: 최고 순위, answer[1]: 최저 순위
//        int[] answer = new int[2];
//
//        for (int i = 0; i < lottos.length; i++) {
//            if (lottos[i] == 0) {
//                // 최고 순위
//                answer[0]++;
//                continue;
//            }
//            for (int j = 0; j < win_nums.length; j++) {
//                if (lottos[i] == win_nums[j]) {
//                   // 최고 순위
//                    answer[0]++;
//                    // 최저순위
//                    answer[1]++;
//                }
//            }
//        }
//        // 순위에 따른 등수로 변환
//        answer[0] = rank[answer[0]];
//        answer[1] = rank[answer[1]];
//        return answer;
//    }
//}
