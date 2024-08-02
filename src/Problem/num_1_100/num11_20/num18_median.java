package Problem.num_1_100.num11_20;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[array.length/2];
        return answer;
    }
}
