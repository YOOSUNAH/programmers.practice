package Problem.num_1_100.num_51_52;

public class num_52_3_studyMore_decimal {
    public static void main(String[] args) {
    }
    class Solution {
        public int[] solution ( int num){

            for (int i = 0; i < num; i++) {
                if (solve(i)) {
                    System.out.println("소수" + i);
                } else {
                    System.out.println("소수 아님" + i);
                }
            }
            return new int[0];
        }

        private static boolean solve ( int num){
            // 0 또는 1은 소수가 아님
            if (num < 2)
                return false;

            // 2는 소수
            if (num == 2)
                return true;

            // 그 외의 수
            for (int i = 0; i < num; i++) {
                if (num % i == 0) { // num보다 아래 수에서 나눠지는 수가 있으면 소수가 아님.
                    return false;
                }
            }
            return true; // 안나왔다면 소수
        }
    }
}
