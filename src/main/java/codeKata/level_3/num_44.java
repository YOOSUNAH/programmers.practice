package codeKata.level_3;
// 최소 직사각형
public class num_44 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max = 0;
            int min = 0;
            for (int i = 0; i < sizes.length; i++) {
                    int maxNum = Math.max(sizes[i][0], sizes[i][1]);
                    int maxMin = Math.min(sizes[i][0], sizes[i][1]);

                    max = Math.max(maxNum, max);
                    min = Math.max(maxMin, min);
            }
            answer = max * min;
            return answer;
        }
    }
}
