package codeKata.level_4;

import java.util.HashMap;
import java.util.Iterator;

// 의상 문제
public class Num_90 {

    public static void main(String[] args) {
        String[][] clothes = {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        solution1(clothes);
        solution2(clothes);
    }
    // 정답
    public static int solution1(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();

        // type별로 옷 종류가 몇개인지 map으로 저장하기.
        for(int i=0; i<clothes.length; i++){
            String cloth_type = clothes[i][1];
            hash.put(cloth_type, hash.getOrDefault(cloth_type, 0) + 1);
        }

        // 경우의 수 세기,
        for (String key : hash.keySet()) {
            answer *= (hash.get(key) + 1);   // 경우의수 (+ 1 해줘야함, 안 입는 경우를 포함 해야함)
        }
        System.out.println(answer - 1);
        return answer-1; // 모드 안입는 경우의 수를 제외해주기 (압인는 경우,안입는 경우, 안입는 경우 => 이렇게 모두 안입는 경우는 없어야 함으로)
    }

    public static int solution2(String[][] clothes) {
        int answer = 1;  // 0이면, 다음에 어떤수를 곱해도 0이 되어버리기 때문에 1로 해야함.

        // 종류별로 개수 저장하기
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];  // headgear
            Integer count = map.getOrDefault(type, 0);  // headgear가 없다 1 , 두번째 headgear를 넣을때는 이미 1이 들어가있음
            map.put(type, count + 1);  // 경우의수 (+ 1 해줘야함, 안입는 경우를 포함)
        }
        // key값을 돌면서, key 값의 갯수
        for (String key: map.keySet()) {
            answer *= map.get(key) + 1;
        }

        System.out.println("answer 2 : " +(answer - 1));
        return answer - 1;  // 모드 안입는 경우의 수를 제외해주기 (모두 안입는 경우는 없어야 함으로)
    }

    // 다른 풀이
    public int solution3(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }

}
