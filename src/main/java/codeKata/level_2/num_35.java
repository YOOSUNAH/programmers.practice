package codeKata.level_2;
// 부족한 금액 계산하기
public class num_35 {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = 0;
            int sum = 0;
            for (int i = 1; i <= count; i++) {
                sum += price * i;
            }
            if(sum > money) answer = sum - money;
            else if(sum < money) answer = money - sum;
            return answer;
        }
    }
}
