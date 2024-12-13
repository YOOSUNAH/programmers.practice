package codeKata.level_4;

import java.util.HashMap;

// 성격 유형 검사하기
public class Num_69 {

    public static void main(String[] args) {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        solution(survey, choices);
    }
//1	매우 비동의   1 - 4 = - 3  | 4 - 1 = 3
//2	비동의       2 - 4 = - 2  |4 - 2 = 2
//3	약간 비동의   3 - 4 = - 1  |4 - 3 = 1
//4	모르겠음     4 - 4 = 0
//5	약간 동의    5 - 4 = 1
//6	동의        6 - 4 = 2
//7	매우 동의    7 - 4 = 3

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                //put 한다. key 값은 CF -> C ,               , (기존 점수) + (4 - 3 = 1)
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + (4 - choices[i]));
            }
            if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + (choices[i] - 4));
            }
        }
        // 더 많은쪽, 같다면 알파벳 순서로
        answer += map.get('R') >= map.get('T') ? "R" : "T";
        answer += map.get('C') >= map.get('F') ? "C" : "F";
        answer += map.get('J') >= map.get('M') ? "J" : "M";
        answer += map.get('A') >= map.get('N') ? "A" : "N";
//        System.out.println(answer.toString());
        return answer;
    }
}
