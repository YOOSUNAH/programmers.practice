package Problem.num_1_100.num_54_60;

import java.util.Arrays;

public class num_55_triangle {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            Arrays.sort(sides); // 오름차순으로 정렬하기

           if (sides[2] < sides[0] + sides[1]){
               answer =1;
           }else{
               answer = 2;
           }
            return answer;
        }
    }
}
