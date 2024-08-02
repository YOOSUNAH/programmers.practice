package Problem.num_1_100.num_54_60;

public class num_57_369game {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int order) {
            int answer = 0;
            String[] arr = String.valueOf(order).split("");
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals("3") || arr[i].equals("6")  || arr[i].equals("9") ){
                    answer++;
                }
            }

            return answer;
        }
    }

}
