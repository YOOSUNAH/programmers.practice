package Problem.num_1_100.num_41_50;

public class num_44_throwBall {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;
            int index =0;

            for (int i = 1; i < k; i++) {
                index +=2;
            }
            index %= numbers.length;
            answer = numbers[index];

            return answer;

        }

    }
}
//    int answer = 0;
//            int[] num = new int[numbers.length];
//
//            int i = 0;
//            while (k > 0) {
//                answer = numbers[i % numbers.length];
//                i += 2;
//                k--;
//            }
//
//            return answer;
//        }
