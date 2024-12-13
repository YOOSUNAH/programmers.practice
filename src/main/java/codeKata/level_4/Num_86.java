package codeKata.level_4;

import java.util.Arrays;

// H-index
public class Num_86 {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        solution(citations);
        solution3(citations);
//        solution5(citations);
    }

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = Math.min(citations[i], citations.length - i);

            if (h >= answer) {
                answer = Math.max(answer, h);
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static int solution2(int[] citations) {

        int higher = 0;

        for (int i = 0; i < citations.length; i++) {
            higher = 0;
            for (int j = 0; j < citations.length; j++) {
                if (i <= citations[j]) {
                    higher++;
                }
            }
            if(higher >= i){
                return i;
            }
        }

        return 0;
    }


    //정답
    public static int solution3(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);  // 0, 1, 3, 5, 6

        for (int i = 0; i < citations.length; i++) {

            int h = citations.length - i;  // 논문의 수 5 , 4, 3, 2, 1
            if (citations[i] >= h) {  // 인용수가 h보다 작아지기 시작하기 전
                answer = h;
                break;
            }
        }
        System.out.println("answer :" + answer);
        return answer;
    }

    // 3번 메서드를 반대로 할경우  -> 정답이 아님...
    public static int solution5(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);  // 0, 1, 3, 5, 6

        for (int i = citations.length - 1; i >= 0; i--) { // 4, 3, 2, 1, ,0

            int h = citations.length - i;  // 5 - 4 = 1, 5 - 3 = 2,
            if (citations[i] <= h) {
                answer = h;
                break;
            }
        }
        System.out.println("answer :" + answer);
        return answer;
    }

    // 다른 사람 풀이
    public static int solution4(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for (int i = citations.length - 1; i > -1; i--) {
            int min = (int) Math.min(citations[i], citations.length - i);
            if (max < min) {
                max = min;
            }
        }
        return max;
    }


}
