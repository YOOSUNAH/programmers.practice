package Problem.num_1_100.num_21_30;

public class num22_evennumberAndOddnumberCount {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            int cnt = 0;
            int cnt2 = 0;

            for (int i : num_list) {
                if (i % 2 == 0) {
                    cnt++;
                    answer[0] = cnt;
                } else {
                    cnt2++;
                    answer[1] = cnt2;
                }
            }
            return answer;
        }
    }
}
