package codeKata.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 카드 뭉치
public class num_55 {
    public static void main(String[] args) {

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        solution1(cards1, cards2, goal);
        solution2(cards1, cards2, goal);

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};
        solution1(cards3, cards4, goal2);
        solution2(cards3, cards4, goal2);
    }

    public static String solution0(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx1 = 0; // cards1 배열의 인덱스
        int idx2 = 0; // cards2 배열의 인덱스

        // goal 배열 순회
        for (String currentStr : goal) {
            // currentStr이 cards1[idx1] 또는 cards2[idx2]에 포함하는지 확인
            if (idx1 < cards1.length && currentStr.equals(cards1[idx1])) {
                idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
            } else if (idx2 < cards2.length && currentStr.equals(cards2[idx2])) {
                idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
            } else {
                answer = "No";
                System.out.println(answer);
                return answer; // 둘 다 포함하지 않는 경우
            }
        }
        answer = "Yes";
        System.out.println(answer);
        return answer;
    }


        public static String solution1(String[] cards1, String[] cards2, String[] goal) {
            // 배열을 list로 바꾸기
            List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
            List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));
            String answer = "Yes";

            for (String str : goal) {
                if (!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
                    card1Ary.remove(0);
                } else if (!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
                    card2Ary.remove(0);
                } else {
                    answer = "No";
                    System.out.println(answer);
                    break;  // 둘다 없으면 No로 탈출
                }
            }
            System.out.println(answer);
            return answer;
        }


        public static String solution2(String[] cards1, String[] cards2, String[] goal) {
            List<String> cards1Ary = new ArrayList<>(Arrays.asList(cards1));
            List<String> cards2Ary = new ArrayList<>(Arrays.asList(cards2));
            String answer = "Yes";
            for (String str : goal) {
                if (!cards1Ary.isEmpty() && str.equals(cards1Ary.get(0))) {
                    cards1Ary.remove(0);
                } else if (!cards2Ary.isEmpty() && str.equals(cards2Ary.get(0))) {
                    cards2Ary.remove(0);
                } else {
                    answer = "No";
                    break;
                }
            }
            return answer;
        }
    }






