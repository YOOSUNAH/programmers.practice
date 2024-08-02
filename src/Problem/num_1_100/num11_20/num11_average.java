package Problem.num_1_100.num11_20;

public class num11_average {
    //정수 배열 `numbers`가 매개변수로 주어집니다. `numbers`의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    //
    //합계를 먼저 for 문으로 구하고, average를 구해야 한다.
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            int sum = 0;

            for(int i = 0; i<numbers.length; i++){
                sum += numbers[i];
            }


            double average = (double)sum / numbers.length;
            return  average;
        }
    }
}
