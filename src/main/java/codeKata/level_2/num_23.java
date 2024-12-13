package codeKata.level_2;

//콜라츠 추측
// 주어진 수가 1이 될대까지 다음 작업을 반복.
//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
// 단 주어진 수가 1인 경우에 0을
// 500번 반복할 때까지 1이 되지 않는 다면 -1을 반환
public class num_23 {
// 문제는 int 파라미터를 받게 되어있지만 실제로는 Long을 놓고 풀어야 맞다. int의 최대치를 넘어가 버려서 long으로 수정해야 통과된다.

    class Solution {
        public int solution(long num) {
            int answer = 0;

           while(num != 1){  // 1이 아닐동안 반복! 1이면 진행하지 않게
               if (num % 2 == 0){
                   num = num / 2;
               }
               else num = num * 3 + 1;
               answer++;

               if (answer >= 500){
                   answer = -1;
                   break;
               }
           }

            return answer;
        }
    }

// 처음 시도 -- 너무 길다!
    class Solution2 {
        public int solution(int num) {
            int answer = 0;
            int count = 0;
            if (num == 1) {
                answer = 0;
            } else {
                for (int i = num; i >= 1; i--) {
                    if (num % 2 == 0) {
                        num = num / 2;
                        count += 1;
                        if (num == 1) {
                            answer = count;
                            break;
                        }
                        else if(count == 500){
                            answer = -1;
                            break;
                        }
                    }
                    if (num % 2 == 1) {
                        num = num * 3 + 1;
                        count += 1;
                        if (num == 1) {
                            answer = count;
                            break;
                        }
                        else if(count == 500){
                            answer = -1;
                            break;
                        }
                    }
                }
            }
            return answer;
        }
    }
}
