package Problem.num_1_100.num11_20;

public class num12_order {
    class Solution {
        //양꼬치10 개당 음료수 1개 할인시 가격
        public int solution(int n, int k) {
            int answer = 0;

            answer = (n * 12000) + (k * 2000) - (n / 10) * 2000;

            return answer;
        }
    }
}

