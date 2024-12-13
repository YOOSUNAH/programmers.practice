package Problem.num_1_100.num_54_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class num_56_nearTheNumber {
    public static void main(String[] args) {

    }

    class Solution {  //결과가 두개일 경우를 잡지 못함.
        public int solution(int[] array, int n) {
            int answer = 0;
            int min = 100;
            int[] arr = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= n) {
                    arr[i] = array[i] - n;
                } else if (array[i] < n) {
                    arr[i] = n - array[i];
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    answer = array[j];
                }
            }

            // // 가까운수가 여러개일 경우 예외처리
            //        // >> '더 작은 수를 리턴'
            //        else if(pre == post) {
            //            answer = array[i-1];
            //            return answer;

            return answer;
        }
    }


    class Solution2 {
        public int solution(int[] array, int n) {
            int answer = 0;
            int min = 100;

            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - n) < min) { // Math.abs() 절대값 구하기
                    min = Math.abs(array[i] - n);  // 차이가 가장 작게 나는 것 , 가장 작은 차이 min에 넣기
                }
            }
            ArrayList<Integer> arr = new ArrayList<Integer>(); // 가까운 수 최대 2개 저장.
            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - n) == min) {  // 정수 n과의 차이가 min이면 그건 저장.
                    arr.add(array[i]);
                }
            }
            Collections.sort(arr); // 오름차순으로 정렬 : 차이가 같을 경우, 더 작은 걸 구하기 위해서
            return arr.get(0);
        }
    }


    class Solution3 { //결과가 두개일 경우를 잡지 못함.
        public int solution(int[] array, int n) {
            Arrays.sort(array);

            int min = 0;
            int minIdx = 0;


            for (int i = 1; i < array.length; i++)
                if (Math.abs(array[i] - n) < Math.abs(array[0] - n)) {
                    min = Math.abs(array[i] - n);
                    minIdx = i;
                }

            return array[minIdx];
        }
    }
}







