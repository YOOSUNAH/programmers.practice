package codeKata.level_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// 신고 결과 받기
public class Num_74 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        solution3(id_list, report, k);
    }



    public static int[] solution3(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;   // answer[0] (muzi임) +1  answer[1] (appeach임) = + 1
                }
            }
        }
        // 답 확인
        for (int i : answer) {
            System.out.println("answer : " + i);
        }
        return answer;
    }



    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> id_listSet = new HashMap<>();
        HashMap<String, String> reportSet = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            id_listSet.put(id_list[i], 0);
        }

        for (int i = 0; i < report.length; i++) {
            String[] s = report[i].split(" "); // muzi  , frodo
            reportSet.put(s[0], s[1]);
        }

        for (int i = 0; i < report.length; i++) {

        }
        System.out.println(answer);
        return answer;
    }

    public static int[] solution2(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for (String reportInfo : reportSet) {
            String reporter = reportInfo.split(" ")[0];
            String reported = reportInfo.split(" ")[1];
            // putVal(hash(key), key, value, true, true);}
            reporterInfoMap.putIfAbsent(reporter,
                new HashSet<String>() {{
                    add(reported);
                }}
            );
            reporterInfoMap.get(reporter).add(reported); // ?
            reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0) + 1);
        }

        for (String reported : reportedCountInfoMap.keySet()) {
            int reportedCount = reportedCountInfoMap.get(reported);

            if (reportedCount >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (reporterInfoMap.containsKey(id_list[i]) && reporterInfoMap.get(id_list[i])
                        .contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
