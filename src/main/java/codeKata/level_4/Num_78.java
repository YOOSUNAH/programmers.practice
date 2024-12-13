package codeKata.level_4;

// 피보나치 수
public class Num_78 {
    public static void main(String[] args) {
        int n = 3;
        solution(n);
    }

    public static int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;

        // F(n) = F(n-1) + F(n-2)
        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        System.out.println(answer[n] % 1234567);
        return answer[n] % 1234567;
    }
}
