package Problem.num_1_100.num_61_70;

public class num_70_FindDigit {
    public static void main(String[] args) {

    }

        public int solution(int n) {
            int answer = 0;

            String[] arr = String.valueOf(n).split("");

            for (int i =0; i < arr.length; i++){
                answer += Integer.parseInt(arr[i]);
            }

            return answer;
        }



}
