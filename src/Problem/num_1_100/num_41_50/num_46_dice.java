package Problem.num_1_100.num_41_50;

public class num_46_dice {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;
            // 몫 * 몫 * 몫
            answer  = (box[0] / n) * (box[1] / n) * (box[2] / n);
            return answer;
        }
    }
}
