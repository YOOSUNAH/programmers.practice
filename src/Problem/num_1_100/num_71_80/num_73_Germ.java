package Problem.num_1_100.num_71_80;

public class num_73_Germ {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int n, int t) {

            int s = (int) Math.pow(2, t);

            int answer = n * s;

            return answer;
        }
    }


}
