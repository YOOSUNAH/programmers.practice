package Problem.num_1_100.num_81_90;
// 유한소수 판별하기
//문제 설명
//소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
//기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
//두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

//제한사항
//a, b는 정수
//0 < a ≤ 1,000
//0 < b ≤ 1,000

//입출력 예
//a   	b	result
//7	    20	1
//11	22	1
//12	21	2

//입출력 예 설명
//입출력 예 #1
//분수 7/20은 기약분수 입니다. 분모 20의 소인수가 2, 5 이기 때문에 유한소수입니다. 따라서 1을 return합니다.
//입출력 예 #2
//분수 11/22는 기약분수로 나타내면 1/2 입니다. 분모 2는 소인수가 2 뿐이기 때문에 유한소수 입니다. 따라서 1을 return합니다.
//입출력 예 #3
//분수 12/21는 기약분수로 나타내면 4/7 입니다. 분모 7은 소인수가 7 이므로 무한소수입니다. 따라서 2를 return합니다.

//Hint
//분자와 분모의 최대공약수로 약분하면 기약분수를 만들 수 있습니다.
//정수도 유한소수로 분류합니다.

import java.util.ArrayList;
import java.util.List;

public class num_88_FiniteDecimalNumber {
    public static void main(String[] args) {

    }


    class Solution {
        public int solution(int a, int b) {
            int finalB = b / GCD(a, b); // 최대공약수로 나눈 것이, 분수를 약분했을때의 분모 값.

            while( finalB != 1) {         // 1일때까지
                if(finalB % 2 == 0) {     // 소인수가 2와 5만 존재하니,
                    finalB /= 2;
                }else if (finalB % 5 == 0) {
                    finalB /= 5;
                }else {                  // 2로도 나눠지지 않고, 5로도 나눠지지 앟으면, 소인수가 2또는 5가 아니니 유한소수가 아님.
                    return 2;
                }
            }
            return 1;

        }
        // 유클리드 호제법!! 두 수의 최대 공약수 구하기
        private int GCD(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return GCD(b, a % b);
            }
        }
    }


    class Solution2 { // 코드 실행은 되지만, 채점은 틀림
        public int solution(int a, int b) {
            int answer = 0;
            List<Integer> list = new ArrayList<>();

            int[] fountain = reduceFraction(a, b);

            int molecule = fountain[0];
            int denominator = fountain[1];

            // n의 소인수를 구하기 위한 반복분
            for (int i = 2; i <= denominator; i++) {
                if (denominator % i == 0) {         // 나누어 떨어지면 소인수,
                    while (denominator % i == 0) {  // 몫이 2개 이상인 경우도 있어, 안 나눠질대까지 나눠주기.
                        denominator /= i;
                    }
                    list.add(i);  // 소인수 저장
                }
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            for (int i = 0; i < result.length; i++){
                if (String.valueOf(result[i]).contains("2") | String.valueOf(result[i]).contains("5")){
                    answer = 1;
                }
                else{
                    answer = 2;
                }
            }

            return answer;
        }
        public static int[] reduceFraction(int bunja, int bunmo) {   // 분수 약분 함수 (Reduce a Fraction)
            int[] frac = new int[2];
            frac[0] = bunja;
            frac[1] = bunmo;

            if (frac[1] == 0) { // 분모가 0일 경우에 에러 반환
                frac[0] = 0;
                frac[1] = 0;
                return frac;
            }

            int gcd_result = gcd(frac[0], frac[1]);

            frac[0] = frac[0] / gcd_result;
            frac[1] = frac[1] / gcd_result;

            return frac;
        }
        public static int gcd(int a, int b) {    // 최대 공약수 계산 메서드
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return Math.abs(a);
        }

    }

}
