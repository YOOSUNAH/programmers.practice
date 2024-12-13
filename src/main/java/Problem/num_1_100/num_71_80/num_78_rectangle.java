package Problem.num_1_100.num_71_80;

public class num_78_rectangle {
    public static void main(String[] args) {

    }

    class Solution1 {
        public int solution(int[][] dots) {
            int answer = 0;
            int w = 0;
            int h = 0;
            int x = dots[0][0];
            int y = dots[0][1];
            for (int i = 1; i < dots.length; i++) {
                if (x != dots[i][0])
                    w = Math.abs(x - dots[i][0]);  // 가로 길이 구하기 , 음수일수도 있으니 절대값
                if (y != dots[i][1])
                    h = Math.abs(y - dots[i][1]); // 세로 길이 구하기
            }
            answer = w * h;
            return answer;
        }
    }

    class Solution2 {
        public int solution(int[][] dots) {
            int answer = 0;
            int minX = dots[0][0];
            int maxX = dots[0][0];

            int minY = dots[0][1];
            int maxY = dots[0][1];

            for (int i = 1; i < dots.length; i++) {
              minX = Math.min(minX, dots[i][0]);
                maxX = Math.max(maxX, dots[i][0]);

                minY = Math.min(minY, dots[i][1]);
                maxY = Math.max(maxY, dots[i][1]);
            }
            answer = (maxX - minX) * (maxY - minY);

            return answer;
        }
    }

}
