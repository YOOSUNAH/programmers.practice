package codeKata.level_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주72 {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        solution2(players, callings);
    }

    // 시간 초과
    public static String[] solution1(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        for (String called : callings) {
            for (int i = 1; i < players.length; i++) {
                if (called.equals(players[i])) {
                    String passed = players[i - 1];
                    players[i] = passed;
                    players[i - 1] = called;
                }
            }
        }
        // 답 확인
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        return players;
    }

    public static String[] solution2(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>(); // 이름, 순위

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String called : callings) {
            int rank = map.get(called);   // 추월한 사람의 순위
            String forwardPlayer = players[rank - 1]; // 앞사람

            players[rank - 1] = called; // 앞사람 위치에 추월한 사람으로 변경
            map.put(called, rank - 1); // (추월한 사람, 앞사람 순위)로 저장

            players[rank] = forwardPlayer;// 추월한사람의 기존 순위에 앞사람이었던 사람 넣기
            map.put(forwardPlayer, rank);// 앞사람, 이전 순위
        }
        // 답 확인
        for (String player: players) {
            System.out.println(player);
        }

        Arrays.stream(players).forEach(System.out::println);

        return players;
    }
}
