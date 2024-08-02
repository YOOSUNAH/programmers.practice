package Problem.num_1_100.num_71_80;

public class num_79_findCoordinate {
    public static void main(String[] args) {

    }


    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0, 0};

            for (int i = 0; i < keyinput.length; i++) {
                switch (keyinput[i]) {
                    case "up":
                        answer[1]++;  // y값 1 증가
                        break;
                    case "down":
                        answer[1]--;  // y값 1 감소
                        break;
                    case "left":
                        answer[0]--;  // x값 1 감소
                        break;
                    case "right":
                        answer[0]++; // x값 1 증가
                        break;
                }

                // 맵의 크기를 벗어난 방향키는 무시해준다. (x/y 좌표, 음수/양수 경우에 따라 각각 처리해줌)
                if (Math.abs(answer[0]) > board[0] / 2 ){ // 나누기 2로 가로 세로 길이 제한 맞춰야 함.
                    answer[0] += (answer[0] > 0) ? -1: 1; // -5 0 5 양수로 벗어나면 -1 해주고 음수로 벗어나면 + 1해준다.
                }
                if (Math.abs(answer[1]) > board[1] / 2){
                    answer[1] += (answer[1] > 0) ? -1: 1;
                }
            }
            return answer;
        }
    }
    class Solution2 {
        public int[] solution(String[] keyinput, int[] board) {
           int[] answer = {0,0};
           int width = board[0] / 2; // 가로 길이 제한  board 크기가 9면 왼쪽으로 최대 -4, 오른쪽으로 최대  +4까지 이동 가능
           int height = board[1] / 2; // 세로 길이 제한

           for (int i = 0; i < keyinput.length; i++){
               switch (keyinput[i]) {
                   case "up":
                       if (answer[1] < height){   // height 길이 제한 이내여야 함.
                       answer[1]++;}  // y값 1 증가
                       break;
                   case "down":
                       if (answer[1] > -(height)){  // 음수는 숫자가 적은 값이 더 크기 때문에 -height 이내에 있어야 함.
                           answer[1]--;}   // y값 1 감소
                       break;
                   case "left":
                       if (answer[0] > -(width)){ // width 가로 길이 제한 이내여야 한다. 왼쪽이니깐 -width 보다 커야 함.
                       answer[0]--; } // x값 1 감소
                       break;
                   case "right":
                       if (answer[0] < (width)){  // width 가로 길이 제한 이내여야 한다. 오른쪽이니깐 +width 보다 작아야 함.
                       answer[0]++;} // x값 1 증가
                       break;
               }
           }

        return answer;
        }
    }

}
