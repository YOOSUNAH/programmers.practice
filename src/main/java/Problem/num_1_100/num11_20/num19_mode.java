package Problem.num_1_100.num11_20;

public class num19_mode {

    static class Solution {
        public static int solution(int[] array) {
            int answer = 0;
            int[] index = new int[1000 + 1];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                index[array[i]]++;
            }

            for (int i = 0; i < index.length; i++) {
                if (max < index[i]) {
                    max = index[i];
                    answer = i;
                }
            }

            for (int i = 0; i < index.length; i++) {
                if (max == index[i] && i != answer) {
                    return -1;
                }
            }

            return answer;
        }
    }
}
