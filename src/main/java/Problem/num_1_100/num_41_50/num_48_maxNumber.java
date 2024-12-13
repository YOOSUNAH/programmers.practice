package Problem.num_1_100.num_41_50;

public class num_48_maxNumber {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= 10; i++) {
                if (factorial(i) <= n) {
                    answer = i;
                }
            }
            return answer;
        }

        public int factorial(int n) { // n을 i 라 보면 더 이해가 잘됨.
            return (n <= 1) ? n : factorial(n - 1) * n;
        }
/* 팩토리얼 구하기
*  public static int factorial (int num) {
        if (num == 1)
            return 1;
        return num * factorial ( num - 1 );
    }
}
*/
    }
}


/*
* public int solution(int n) {
        int answer = 0;
            int[] factorial = new int[10];
            int fac = 1;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= i; j++) {
                    fac *= j;
                    factorial[i - 1] = fac;
                }
            }

            for (int i = 10; i > 0; i--) {
                if (factorial[i] <= n) {
                  answer = i;
                  break;
                }
            }
            return answer;
 }
 * */








