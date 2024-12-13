package codeKata.level_3;
// 삼총사
public class num_42 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            for (int i = 0; i < number.length; i++) {
                // 서로 다른 숫자여야 하니 j = i +1, k = j +1 이어야 한다.
                for (int j = i+1; j < number.length; j++) {
                    for (int k = j+1; k < number.length; k++) {
                       if(number[i] + number[j] + number[k] == 0){
                           answer++;
                       }
                    }
                }
            }
            return answer;
        }
    }
}
