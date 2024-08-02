package Problem.num_1_100.num_31_40;

public class num_35_compare_height {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for(int i=0; i<array.length; i++) {  //0부터 매개변수로 들어온 array배열의 크기만큼 for문
                if(array[i] > height) {            //만약 array배열의 i번째 숫자가 매가변수로 들어온 height보다 크면
                    answer++;                    //answer에 1을 더함
                }
            }
            return answer;
        }
    }
}
