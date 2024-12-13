package Problem.num_1_100.num_61_70;

public class num_64_doubleCountNumber {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for (int i =0; i < array.length; i++){
                if (array[i] == n){
                    answer++;
                }
            }
            return answer;
        }
    }


}
