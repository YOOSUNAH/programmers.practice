package Problem.num_1_100.num_71_80;

import java.util.Arrays;


public class num_75_findMax {
    public static void main(int[] args) {
//        int[] arr= {1, 2, -3, 4, -5};
//        sol(arr);
    }

    class Solution {  // 코드 실행은 가능하나, 메모리 초과로 실패
        public static int sol(int[] numbers) {
            int answer = 0;
            int n = numbers.length;
            int s = (int) Math.pow(n, n);
            int[] arr = new int[s];
            int k = 0;

            for (int i = 0; i < numbers.length; i++){
                for (int j =0; j < numbers.length; j++){
                    arr[k] = numbers[i] * numbers[j];
                    k++;
                }
            }

            Arrays.sort(arr);
            System.out.println(arr);

            answer = arr[arr.length-3];
            return answer;
        }
    }

    class Solution2 {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);  // 오름 차순으로 정렬 한다. 그럼 제일 큰 수끼리 곱한게 제일 크다.

            int maxRight = numbers[numbers.length - 1] * numbers[numbers.length - 2];
            int maxLeft = numbers[0] * numbers[1];   // 음수도 있으니 음수들끼리 곱한 것들과도 비교하기.

            int answer = (maxRight > maxLeft) ? maxRight : maxLeft;
            return answer;
        }
    }



}
