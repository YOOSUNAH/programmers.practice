package Problem.num_1_100.num11_20;

public class num20_oddNumber {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n) {
                int[] answer = null;
                if(n%2 == 0){   //짝수일때, 홀수일때 크기가 달라져야 해서!
                    answer = new int[n/2];
                } else {
                    answer = new int[n/2+1];
                }

                for (int i = 1; i <= n ; i += 2) {
                    answer[i/2] = i;
                }
                return answer;

            }
        }
    }
}
