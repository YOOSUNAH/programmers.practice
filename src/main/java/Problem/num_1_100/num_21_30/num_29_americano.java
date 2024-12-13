package Problem.num_1_100.num_21_30;

public class num_29_americano {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];

            answer[0]  = (int)(money/5500);
            answer[1] = (int)(money%5500);

            return answer;
        }
    }

}
