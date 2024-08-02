package Problem.num_1_100.num1_10;

public class num9_angle {
    //0 < angle < 90 으로 못쓴다 .한개씩 연결해줘야 한다.
    class Solution {
        public int solution(int angle) {
            int answer = 0;

            if( 0 < angle && angle < 90)
                answer = 1;

            else if(angle == 90)
                answer = 2;

            else if(90 < angle && angle < 180)
                answer = 3;

            else if (angle == 180)
                answer = 4;

            return answer;
        }
    }
}
