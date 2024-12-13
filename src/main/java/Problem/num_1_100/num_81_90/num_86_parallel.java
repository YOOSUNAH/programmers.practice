package Problem.num_1_100.num_81_90;
//문제 설명
//점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
//[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
//주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

//제한사항
//dots의 길이 = 4
//dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
//0 ≤ x, y ≤ 100
//서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
//두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
//임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.

//입출력 예
//dots	                           result
//[[1, 4], [9, 2], [3, 8], [11, 6]]	1
//[[3, 5], [4, 1], [2, 4], [5, 10]]	0

import java.util.ArrayList;
import java.util.List;

public class num_86_parallel {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[][] dots) { // 채점 완료
            int answer = 0;

            int x1 = dots[0][0];
            int y1 = dots[0][1];
            int x2 = dots[1][0];
            int y2 = dots[1][1];
            int x3 = dots[2][0];
            int y3 = dots[2][1];
            int x4 = dots[3][0];
            int y4 = dots[3][1];

            double slope1 = (double) (y2 - y1) / (x2 - x1);
            double slope2 = (double) (y4 -y3) / (x4 - x3);
            if (slope1 == slope2)  answer = 1;

                slope1 = (double) (y3 - y1) / (x3 - x1);
                slope2 = (double) (y4 - y2) / (x4 - x2);
                if (slope1 == slope2) answer = 1;

                slope1 = (double) (y4 - y1) / (x4 - x1);
                slope2 = (double) (y3 - y2) / (x3 - x2);
                if (slope1 == slope2) answer = 1;

            return answer;
        }
    }


    class Solution3 { // 코드는 실행되는데 채점 은 틀림.
        public int solution(int[][] dots) {
            List<Double> Inclination = new ArrayList<>();
            for (int i = 0; i < dots.length; i++) {
                for (int j = (i + 1); j < dots.length; j++) {
                    double slope = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]); // y 증가량 / x 증가량
                    // y 증가량 : y2 - y2, x 증가량 : x2 - x1
                    if (Inclination.contains(slope))  // 기울기가 같은걸 포함하고 있으면
                        return 1;
                    Inclination.add(slope); // 기울기를 list에 계속 더해간다.
                }
            }
            return 0;
        }
    }
}


//    class Solution3 { // 처음 접근한 것 , x좌표 , y좌표 사용이 익숙치 않다.
//        public int solution(int[][] dots) {
//            int answer = 0;
//            int FirstInclination = 0;
//            int SecondIclination = 0;
//            for (int i = 0; i < dots.length; i++) {
//                for (int j = 0; j < dots.length; j++) {
//                    FirstInclination = (dots[i + 1][0] - dots[i][0]) / (dots[0][i + 1] -dots[0][i]);
//                    SecondIclination = (dots[i + 3][0] - dots[i + 2][0]) / (dots[0][i + 3] -dots[0][i + 2]);
//                    if (FirstInclination == SecondIclination){
//                        answer = 1;
//                        break;
//                    }else {
//                        answer = 0;
//                    }
//                }
//            }
//            return answer;
//        }
//    }

