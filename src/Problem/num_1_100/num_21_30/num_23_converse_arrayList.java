package Problem.num_1_100.num_21_30;

public class num_23_converse_arrayList {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int [num_list.length] ;  // 이렇게 길이를 제한해줘야 한다!!
            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[num_list.length - i - 1];
            }
            return answer;
        }
    }


}



