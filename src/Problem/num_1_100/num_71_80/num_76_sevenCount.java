package Problem.num_1_100.num_71_80;

public class num_76_sevenCount {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int count = 0;

            String[] arr = new String[array.length];

            for (int i =0; i < array.length; i++){
                arr[i] = String.valueOf(array[i]);   // 정수 배열을 문자열 배열로 바꾼다.
            }

            String joinString = String.join(", ", arr);  // 문자열들을 하나의 문자열로합친다.
            String[] s = joinString.split("");  // 문자열을 한개씩 분리시켜 문자열 배열에 넣는다.

            for (int i = 0; i < s.length; i++){
                if (s[i].equals("7")){
                    count++;
                }
            }
            answer = count;
            return answer;
        }
    }

}
