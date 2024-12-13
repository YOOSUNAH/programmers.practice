package Problem.num_1_100.num_51_52;

import java.util.ArrayList;
import java.util.List;

public class num_52_1_Factorization {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] solution(int n) {
//            int[] answer = {};

            List<Integer> list = new ArrayList<>();

            // n의 소인수를 구하기 위한 반복분
            for (int i = 2; i <= n; i++) {
                // 나누어 떨어지면 소인수,
                // 몫이 2개 이상인 경우도 있어, 안 나눠질대까지 나눠주기.
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    // 소인수 저장
                    list.add(i);
                }
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }


}
