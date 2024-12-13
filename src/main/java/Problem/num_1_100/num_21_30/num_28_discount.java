package Problem.num_1_100.num_21_30;

public class num_28_discount {
    public static void main(String[] args) {


    }

    class Solution {
        public int solution(int price) {
            int answer = 0;

            if(price >= 500000 ){
                answer = (int)(price*0.8);
            }
            else if(price >= 300000 ){
                answer = (int)(price*0.9);
            }
            else if(price >= 100000 ){
                answer = (int)(price*0.95);
            }
            else {
                answer = price;
            }
            return answer;

        }
    }
}
