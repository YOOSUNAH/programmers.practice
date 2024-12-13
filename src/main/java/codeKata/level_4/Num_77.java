package codeKata.level_4;

// 이진변환 반복하기 푸는 중
public class Num_77 {
    public static void main(String[] args) {
        int n = 3;
        fibonachi(n);
    }

        public static  int fibonachi(int n) {
            int[] answer = new int[n + 1];
            answer[0] = 0;
            answer[1] = 1;

            for (int i = 2; i <= n; i++) {
                answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
            }
            System.out.println(answer[n] % 1234567);
            return answer[n] % 1234567;
        }
    }

