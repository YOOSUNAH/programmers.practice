package codeKata.level_4;

import java.util.HashMap;
import java.util.Map;

public class Num_89 {

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
//        solution(want, number, discount);
//        solution2(want, number, discount);
        solution3(want, number, discount);
    }


    // version 1
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i <  want.length; i++) target.put(want[i], number[i]);

        Map<String, Integer> map = new HashMap<>();
        // init
        for (int i = 0; i < 10; i++) map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);

        // 초기값도 확인
        if (check(target, map)) answer++;

        for (int i = 1; i < discount.length - 9; i++) {
            String previousKey = discount[i - 1];
            int end = i + 9;
            // start 제거
            map.put(previousKey, map.getOrDefault(previousKey, 0) - 1);
            if (map.get(previousKey) == 0) map.remove(previousKey);
            map.put(discount[end], map.getOrDefault(discount[end], 0) + 1);

            if (check(target, map)) answer++;

        }
        System.out.println(answer);
        return answer;
    }
    static boolean check(Map<String, Integer> target, Map<String, Integer> map) {
        for (String key: map.keySet()) {
            if (!target.containsKey(key) || map.get(key) != target.get(key)) return false;
        }
        return true;
    }


    // version 2
    public static int solution2(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // i부터 10일간 할인 품목 map에 넣기
        for(int i = 0; i < discount.length; i++) {
            Map<String, Integer> dis = new HashMap<>();
            int cnt = 0;
            for(int j = i; j < discount.length; j++) {
                // 10일이 지나면 중단
                if(cnt == 10) {
                    break;
                }
                dis.put(discount[j], dis.getOrDefault(discount[j], 0) + 1);
                cnt++;
            }

            // number와 map의 값을 비교
            boolean flag = false;
            for(int j = 0; j < want.length; j++) {
                // map에 want 물품이 없으면 탐색 종료
                if(dis.get(want[j]) == null) {
                    flag = true;
                    break;
                }
                // map의 값보다 want 값이 크면
                if(number[j] > dis.get(want[j])) {
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                answer++;
            }

        }
        return answer;
    }


    // version 3
    public static int solution3(String[] want, int[] number, String[] discount){
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        // 원하는 제품, 수량 저장
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int day = 10;

        // 구매할 수 있는 날짜 세기
        for (int i = 0; i < discount.length - day + 1; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            // 할인하는 제품, 개수 저장
            for (int k = 0; k < day; k++) {
                discountMap.put(discount[i + k], discountMap.getOrDefault(discount[i + k], 0) + 1);
            }

            Boolean wantNumberExist  = true;

            // 할인하는 제품 개수, 원하는 제품 개수 비교
            for (String key:wantMap.keySet()) {
                if(wantMap.get(key) != discountMap.get(key)){
                    wantNumberExist = false;
                    break;
                }
            }
            // 개수 일치하는 경우
            if(wantNumberExist){
                answer++;
            }
        }
        System.out.println(answer);
    return answer;
    }

}
