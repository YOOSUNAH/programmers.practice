package Problem.num_1_100.num_61_70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num_68_findNumber {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int num, int k) {
            int answer = 0;

            String NUM = String.valueOf(num); // "29183"
            String[] arr = NUM.split("");  // String[] arr = {"2", "9", "1", "8", "3"}

            List<String> strList = new ArrayList<>(Arrays.asList(arr)); // contains 쓰기 위해 List로 전환

                if (Arrays.asList(arr).contains(String.valueOf(k))) { // "k" 있는지 확인
                    answer = strList.indexOf(String.valueOf(k)) + 1;
                }else{
                    answer = -1;
                }

            return answer;
        }
    }


}
