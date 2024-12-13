package Problem.num_1_100.num_21_30;

public class num21_fountainPlus {
    public static void main(String[] args) {
        int[] solution = solution(1, 2, 3, 4);

    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd_num = getGCD(numer, denom);

        int[] answer = {numer / gcd_num, denom / gcd_num};
        return answer;
    }

    public static int getGCD(int denom1, int denom2) {
        if (denom1 % denom2 == 0) {
            return denom2;
        }
        return getGCD(denom2, denom1 % denom2);
    }
}
