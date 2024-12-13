package Problem.num_1_100.num_31_40;

import java.util.Arrays;
import java.util.Collections;

public class num_37_diagnosis_order {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];
            
            // int를 Integer로 바꾸고 , 내림차순으로 정렬
            Integer[] arr = new Integer[emergency.length];
            for(int i = 0; i<emergency.length; i++){
                arr[i] = emergency[i];
            }
           Arrays.sort(arr, Collections.reverseOrder());

//            int[] answer = new int[emergency.length];
//            ArrayList<Integer> newEmergency = new ArrayList<Integer>(); //arraylist를 하나 만듬
//            for (int i : emergency) {                                 //매개변수로 들어온 int배열을 하나씩 arraylist에 넣음
//                newEmergency.add(i);
//            }
//
//            Collections.sort(newEmergency, Collections.reverseOrder()); // 내림차순으로 정렬

            for (int i = 0; i < answer.length; i++) {
//                answer[i] = newEmergency.indexOf(emergency[i]) + 1;     //arraylist에서 emergency배열의 i번째 정수의 인덱스값을 넣음

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == emergency[i]) {
                        answer[i] = j + 1;
                        break;
                    }
                }
            }

            return answer;
        }
    }

}
