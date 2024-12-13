package codeKata.level_4;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기74 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        solution(id_list, report, k);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {id_list.length};

        HashMap<String, HashSet<String>> idSetMap = new HashMap<>();
        HashMap<String, Integer> idMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            idSetMap.put(name,  new HashSet<>());  // muzi, set<>
            idMap.put(name, i);  // muzi, 0  //  frodo , 1  // appeach, 2 // neo , 3
        }

        for (String x :report) {
            String from = x.split(" ")[0];  // muzi
            String to = x.split(" ")[1];  // frodo
            idSetMap.get(to).add(from);  // frodo key 값에 muzi 를 value에 더해
        }

        // k번 이상 신고된 유저는 게시판 이용이 정지되며,
        // 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = idSetMap.get(id_list[i]);  // value들을 넣어  muzi, appeach

            if(send.size() >= k) { // muzi, appeach 2개 >= k
                for (String name : send) {
                    answer[idMap.get(
                        name)]++;  // muzi 번호 0번, answer[0]에다가 +1 ,  appeach 번호는 1번 answer[1]에다가  + 1
                }
            }
        }
        // 답확인
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}
