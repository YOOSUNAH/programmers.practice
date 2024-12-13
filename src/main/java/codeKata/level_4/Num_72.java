package codeKata.level_4;

import java.util.HashMap;
import java.util.Map;

// 달리기 경주
public class Num_72 {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
       // solution(players, callings); // 시간 초과
       //  solution2(players, callings); // 런타임 에러

        solution3(players, callings);
    }


    // 시간 초과
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            answer[i] = players[i];
        }

        for (String calledPlayer : callings) {
            for (int i = 0; i < answer.length; i++) {
                if (calledPlayer.equals(answer[i])) {
                    String tempS = answer[i - 1]; // 자리 교체를 위한 임시 저장
                    answer[i - 1] = answer[i];  // poe 자리에 kai가
                    answer[i] = tempS;           // kai 자리에 poe가
                }
            }
        }

//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(answer[i]);
//        }
        return answer;
    }

    // 런타임 에러
    public static String[] solution2(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer, String> rank = new HashMap<>();  // 순위, 사람
        Map<String, Integer> player = new HashMap<>();  // 사람, 순위

        for (int i = 0; i < players.length; i++) {
            rank.put(i + 1, players[i]);
            player.put(players[i], i + 1);
        }

        for (String called: callings) {
             int nowPlayerRank = player.get(called); // 현재 플레이어의 순위
             int frontPlayerRank = nowPlayerRank - 1; // 앞 플레이어의 순위
            String frontPlayerName = rank.get(frontPlayerRank); //앞 플레이어 이름

            rank.put(frontPlayerRank, called);// 추월할 선수 이름 앞으로
            rank.put(nowPlayerRank, frontPlayerName);// 추월 당한 선수 뒤로
           player.put(frontPlayerName, frontPlayerRank); // 추월 당한 선수 순위 다운
           player.put(called, frontPlayerRank); // 추월한 선수 순위 업
        }

        int count = 0;
        for (String s: rank.values()) {
            answer[count++] = s;
        }
        return answer;
    }

    public static String[] solution3(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>(); // 이름, 순위

        // 현재 순위로 저장 우선
        for (int i = 0; i < players.length; i++) {
            String player = players[i];
            map.put(player, i);
        }

        //
        for (String calling : callings) {
            int grade = map.get(calling);    // 추월한 사람의 순위
            String forwardCalling = players[grade - 1];  // 앞사람

            players[grade - 1] = calling; // 앞사람 순위의 추월한 사람으로 변경
            map.put(calling, grade - 1);  // 추월한 사람, 추월하여 갖게 된 순위

            players[grade] = forwardCalling;  // 추월한사람의 기존 순위에 앞사람이었던 사람 넣기
            map.put(forwardCalling, grade);   // 앞사람, 이전 순위
        }

//        for (int i = 0; i < players.length; i++) {
//            System.out.println(players[i]);
//        }

        return players;

    }

}
