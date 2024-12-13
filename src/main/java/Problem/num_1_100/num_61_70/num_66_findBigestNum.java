package Problem.num_1_100.num_61_70;

public class num_66_findBigestNum {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];
            int max = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] >max){
                    max = array[i];
                    answer[0] = max;
                    answer[1] = i;
                }
            }
            return answer;
        }
    }

}
