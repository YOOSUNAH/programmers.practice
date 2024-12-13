package Problem.num_1_100.num_91_100;
//등수 매기기
//문제 설명
//영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

//제한사항
//0 ≤ score[0], score[1] ≤ 100
//1 ≤ score의 길이 ≤ 10
//score의 원소 길이는 2입니다.
//score는 중복된 원소를 갖지 않습니다.

//입출력 예
//score	                                                                         result
//[[80, 70], [90, 50], [40, 70], [50, 80]]	                                    [1, 2, 4, 3]
//[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class num_92_rank {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int[][] score) {
            List<Integer> scoreList = new ArrayList<>();
            for (int i = 0; i < score.length; i++){
            scoreList.add(score[i][0] + score[i][1]);
            }
            scoreList.sort(Comparator.reverseOrder());

            int[] answer = new int[score.length];
            for (int i = 0; i < score.length; i++) {
                answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
            }

            return answer;
        }
    }

}
