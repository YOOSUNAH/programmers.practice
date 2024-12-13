package codeKata.level_4;

import java.util.HashMap;

// 대충 만든 자판
public class Num_66 {

    public static void main(String[] args) {

        String[] keymap =  {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        solution(keymap, targets);

    }

    // 앞부분 뒷부분 합침( solution 앞부분 , solution 1 뒷부분)
    public static int[] solution3(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            HashMap<Character, Integer> keypad = new HashMap<>();

            for (int i = 0; i < keymap.length; i++) {   // ABACD, BCEFD
                for (int j = 0; j < keymap[i].length(); j++) { // ABACD
                    char c  = keymap[i].charAt(j); // A, B, A, C, D

                    if(keypad.containsKey(c)){
                        int inx = keypad.get(c);  // Index
                        keypad.put(c, Math.min(inx, j + 1)); // index, 순서대로 한거랑 비교
                    }
                    else keypad.put(c, j+1); // 없으면!! 저장! c(알파벳), 순서 1,2,3,4,5

                }
            }

            for(int i=0; i< targets.length;i++){
                int sum = 0;
                for(int j=0; j<targets[i].length();j++){

                    char ch = targets[i].charAt(j);

                    if(keypad.containsKey(ch)){
                        sum+=keypad.get(ch);
                    }else{
                        sum = -1;
                        break;
                    }
                }
                answer[i] = sum;
            }

            return answer;
        }


        public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int j = 0; j < key.length(); j++) {

                char ch = key.charAt(j);

                if (map.containsKey(ch)){
                    if(map.get(ch)>j){
                        map.replace(ch,j+1);
                    }
                }else{
                    map.put(ch,j+1);
                }
            }
        }

        for(int i=0; i< targets.length;i++){
            int sum = 0;
            for(int j=0; j<targets[i].length();j++){

                char ch = targets[i].charAt(j);

                if(map.containsKey(ch)){
                    sum+=map.get(ch);
                }else{
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }

        return answer;
    }

    public static int[] solution1(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {   // ABACD, BCEFD
            for (int j = 0; j < keymap[i].length(); j++) { // ABACD
                char c  = keymap[i].charAt(j); // A, B, A, C, D

                if(keypad.containsKey(c)){
                    int inx = keypad.get(c);  // Index
                    keypad.put(c, Math.min(inx, j + 1)); // index, 순서대로 한거랑 비교
                }
                else keypad.put(c, j+1); // 없으면!! 저장! c(알파벳), 순서 1,2,3,4,5

            }
        }
        for (int i = 0; i < targets.length; i++) { // ABCD, AABB
            String target = targets[i]; // ABCD
            int count = 0;
            boolean flag = true;
            
            for (char c : target.toCharArray()) { // A, B, C, D
                if(keypad.containsKey(c)){  // target 첫번째 알파멧 A 포함하면
                    count += keypad.get(c); // 알파멧의 인덱스인 1을 가지고 온다.
                }else {
                    flag = false; // 없다면
                    break;
                }
            }
            answer[i] = (flag == false) ? -1 : count; // 없으면 -1, 있으면 인덱스를 저장해준다.
        }
        return answer;
    }

}
