package Problem.num_1_100.num_81_90;
//겹치는 선분의 길이
//문제 설명
//선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//lines가 [[0, 2], [-3, -1], [-2, 1]]일 때
//선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다

//제한사항
//lines의 길이 = 3
//lines의 원소의 길이 = 2
//모든 선분은 길이가 1 이상입니다.
//lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
//-100 ≤ a < b ≤ 100

//입출력 예
//lines	                    result
//[[0, 1], [2, 5], [3, 9]]	2
//[[-1, 1], [1, 3], [3, 9]]	0
//[[0, 5], [3, 9], [1, 10]]	8
public class num_87_overlapLine {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[][] lines) {
            int answer = 0;

            int[] count = new int[200];  // 원소는 100까지인데, -100때문에 100을 더해줄거기때문에 200으로 크기를 정함.

            for (int[] i : lines) {
                int start = i[0] + 100;  // 음수를 인덱스로 사용할 수 없으니 100을 더해주기
                int end = i[1] + 100;

                for (int j = start; j < end ; j++) {   // [0,2] 선분이면 0, 1, 2에
                    count[j] += 1;                     // 1칸에 1을 표시한다.
                }
            }

            for (int i : count){
                if (i > 1)  // 중복된 선분은 값이 1이 아닌 2이상일 것이다.
                    answer++; // 2이상인 값일때마다 (중복된 선분의 길이일때마다) 더해준다.
            }

            return answer;
        }
    }

}
