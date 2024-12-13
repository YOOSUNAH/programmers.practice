package Problem.num_1_100.num_31_40;

import java.util.Arrays;

public class num_31_max {
    public static void main(String[] args) {

    }
/*
* Arrays.sort(numbers)로 오름차순으로 0 1 2 3 4  정렬한다.!!
length가 5이면 인덱스로 4번째여야 같은 위치이니
max는 numbers[numbers.length-1]
max 다음으로 큰 수는 numbers[numbers.length-2]다.*/
    class Solution {
            public int solution(int[] numbers) {
                int answer = 0;
                Arrays.sort(numbers);
                return numbers[numbers.length-1]*numbers[numbers.length-2];
            }
        }
    }

//        public int solution(int[] numbers) {
//            int answer = 0;
//            int max = numbers[0];
//            int second = numbers[0];
//
//            for(int i = 0; i <numbers.length; i++ ){
//                if(numbers[i] > max){
//                    max = numbers[i];
//                }
//                second = numbers[i-1];
//            }
//            answer = max * second;
//            return answer;


//        int solution(int numbers[], size_t numbers_len) {
//            int answer = 0;
//            for (int i = 0; i < numbers_len; i++)
//                for (int j = i + 1; j < numbers_len; j++)
//                    if (numbers[i] * numbers[j] > answer)
//                        answer = numbers[i] * numbers[j];
//            return answer;
//        }


