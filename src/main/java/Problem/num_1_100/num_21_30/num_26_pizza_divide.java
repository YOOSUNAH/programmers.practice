package Problem.num_1_100.num_21_30;

public class num_26_pizza_divide {
    public static void main(String[] args) {
        class Solution {
            public int solution(int slice, int n) {
                int answer = 0;

                if(n % slice == 0 ){
                    answer = n/slice;
                }
                else{
                    answer = n/slice + 1;
                }

                return answer;
            }
        }
    }
}
