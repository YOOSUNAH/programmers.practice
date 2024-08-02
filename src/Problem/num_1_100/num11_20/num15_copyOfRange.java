package Problem.num_1_100.num11_20;

import java.util.Arrays;

public class num15_copyOfRange {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1, num2 + 1);
        }
    }
}
