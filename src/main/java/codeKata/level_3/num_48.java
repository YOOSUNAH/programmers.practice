package codeKata.level_3;
//    K번째수
//    문제 설명
//    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//    2에서 나온 배열의 3번째 숫자는 5입니다.
//    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.


import java.util.*;

public class num_48 {
    class Solution {
//        public int[] solution(int[] array, int[][] commands) {
//            int[] answer = new int[commands[0].length];
//            for (int l = 0; l < answer.length; l++) {
//                // commands[0][0] 2, 5, 3,
//                int i = commands[l][0] - 1;  // 2 - 1 = 1
//                int j = commands[l][1];  // 5
//                int k = commands[l][2] - 1; // 3 - 1 = 2
//                int[] arr = new int[j - i + 1];
//                for (int m = i; m < j; m++) {
//                    int n = 0;
//                    arr[n] = array[m];  // 1, 2, 3, 4번쨰 인덱스 값 (1,5,2,6,3,7,4)면 5,2,6,3
//                    n++;
//                }
//                Arrays.sort(arr); // 2,3,5,6
//                answer[l] = arr[k]; // k번째 2번째 5번
//            }
//            return answer;
//        }
    }

            public int[] solution(int[] array, int[][] commands) {
                int[] answer = new int[commands.length];
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = 0; i < commands.length; i++) {
                    for (int j = commands[i][0]; j <= commands[i][1]; j++) { // 2   ~  5  번째
                        list.add(array[j - 1]);  // 2-1 = 1번째 인덱스부터 5전인 4까지 (1 ~ 4 인덱스)  값 (5,2,6,3)
                        Collections.sort(list); // (2,3,5,6)
                    }
                    answer[i] = list.get(commands[i][2] - 1);  // k번째, 3번째 (인덱스로는 2) 값은 5
                    list.clear();
                }
                return answer;
            }

    }

