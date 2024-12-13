package codeKata.level_4;

import java.util.HashMap;

public class 대충만든자판 {


    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        solution(keymap, targets);

    }

    // 런타임 에러
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int k = 0; k < keymap[i].length(); k++) { // "ABACD"
                char c = keymap[i].charAt(k);  // "A"
           // 저장 중
                // 있으면 작은걸로 교체
                if (keypad.containsKey(c)) {
                    int index = keypad.get(c);
                    int newIndex = Math.min(index, k + 1);
                    keypad.put(c, newIndex);
                // 없으면 저장!
                } else {
                    keypad.put(c, k + 1);  // (A, 1) (B, 2)
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String t = targets[i];
            char tCh = t.charAt(i);
            int sum = 0;

            for (int k = 0; k < t.length(); k++) {
                tCh = t.charAt(k);
                if (keypad.containsKey(tCh)) {
                    sum += keypad.get(tCh);
                } else {
                    sum += -1;
                }
            }
            answer[i] = sum;
//            System.out.println("i : " + i + "  sum : " + sum);
        }

//        for (int i = 0; i < targets.length; i++) {
//            System.out.println("answer[i] : " + answer[i]);
//        }

        return answer;
    }
}
