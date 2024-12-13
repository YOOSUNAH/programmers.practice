package codeKata.level_2;
// 최대 공약수와 최소 공배수
public class num_39 {
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];
            int gcd = GCD(n, m);
            answer[0] = gcd;
            int lcm = LCM(n, m);
            answer[1] = lcm;
            return answer;
        }
        // 최대 공약수 구하기
        private int GCD(int n, int m) {
            if (n % m == 0) {
                return m;
            }
            return GCD(m, n % m);
        }
        private int LCM(int n, int m){
            return n * m / GCD(n, m);  // 최대공약수로 나누기
        }
    }
}
