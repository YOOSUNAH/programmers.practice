package codeKata.level_3;
//두 개 뽑아서 더하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num_49 {
    class Solution {
        public List<Integer> solution(int[] numbers) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                   int sum = numbers[i] + numbers[j];
                   if(arr.contains(sum)){
                       continue;
                   }else{
                   arr.add(sum);
                }
                }
            }
            Collections.sort(arr);
            return arr;
        }
    }


}
