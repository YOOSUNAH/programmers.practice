package codeKata.level_4;

public class 둘만의암호67 {

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        solution(s, skip, index);
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);  // a, u, k, k, s
            int count = 1;

            while (count <= index) {  // 5 까지
                sCh++;

                if (sCh > 'z') {  // 알파벳이 'z'를 넘어가면 'a'로 돌아가게 해준다.
                    sCh -= 26;
                }
                if (skip.contains(sCh + "")) {
                    continue;
                } else {
                    count++;
                }
            }
            answer += sCh;
        }

        System.out.println(answer);
        return answer;
    }
}
