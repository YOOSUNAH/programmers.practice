package Problem.num_1_100.num_41_50;

public class num_42 {
    public static void main(String[] args) {
    }

        public int combination ( int n, int m){
            if (m == 0 || n == m) {
                return 1;
            } else {
                return combination(n - 1, m - 1) + combination(n - 1, m);
            }
        }

        public int solution ( int balls, int share){
            int answer = 0;

            answer = combination(balls, share);
            return answer;
        }
    }

