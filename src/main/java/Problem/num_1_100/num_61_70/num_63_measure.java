package Problem.num_1_100.num_61_70;

import java.util.Arrays;

public class num_63_measure {
    public static void main(String[] args) {

    }

    class Solution2 {
        public int[] solution(int n) {

            int a = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    a++;  // 약수의 개수 구하기
                }
            }
            int[] answer = new int[a]; // 구한 개수로 배열 크기 지정.
            int index = 0;
            for (int i = 1; i <= n; i++) { // 다시 약수 구하기
                if (n % i == 0) {
                    answer[index] = i;
                    index++;
                }
            }
            Arrays.sort(answer); // 오름차순으로 정렬
            return answer;
        }
    }


    class Solution { // 다른 사람 풀이
        public int[] solution(int n) {
            int[] arry = new int[10000];
            int index = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arry[index] = i;
                    index++;
                }
            }
            int[] answer = new int[index];
            for (int i = 0; i < index; i++) {
                if (arry[i] != 0) {
                    answer[i] = arry[i];

                }
            }
            return answer;
        }
    }


}
