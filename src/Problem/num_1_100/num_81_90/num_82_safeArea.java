package Problem.num_1_100.num_81_90;

// 문제
// 문제 설명
//다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
//제한사항
//board는 n * n 배열입니다.
//1 ≤ n ≤ 100
//지뢰는 1로 표시되어 있습니다.
//board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.

//입출력 예
//board = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]
// result 16

//board = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]
// result 13

//board = [[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]
// result 0

public class num_82_safeArea {
    public static void main(String[] args) {
//  explosionX >= 0
//     X (0,0)보다는 커야 하니깐,
// X [[0, 0, 0, 0, 0],
//    [0, 0, 0, 0, 0],
//    [0, 0, 0, 0, 0],
//    [0, 0, 1, 0, 0],
//    [0, 0, 0, 0, 0]]	explosionX < boomBoard.length

       // solution();
    }
    class Solution{ // 채점 완료
            public int solution(int[][] board) {
                int[][] boomBoard = new int[board.length][board[0].length];
                for (int i = 0; i < board.length; i++) {  // 가로? 세로?
                    for (int j = 0; j < board[i].length; j++) {
                        if (board[i][j] == 1) checkExplosion(i, j, boomBoard);  // 위험 지역 찾기
                    }
                }

                int count = 0;
                for (int[] array : boomBoard) {
                    for (int value : array) {
                        if (value == 0) count++;  // 안전지대는 0, 그걸 count 해주기
                    }
                }
                return count;
            }

            static void checkExplosion(int x, int y, int[][] boomBoard) {
                int explosionX;
                int explosionY;
                int[] aroundX = {0, -1, -1, -1,  0, 0,  1, 1, 1};   // 주어진 걸 (0,0) 기준으로 위험 지역을 체크 하는 것
                int[] aroundY = {0, -1,  0,  1, -1, 1, -1, 0, 1};   // x,y = 0,0 이런 식으로 쌍을 짓게 됨.
                for (int i = 0; i < 9; i++) {
                    explosionX = x + aroundX[i];  // 주어진 걸  (0,0) 기준 으로 두기 위해 더하는 것
                    explosionY = y + aroundY[i];

                    if (explosionX < boomBoard.length   // 크기를 넘지 않고 (오른쪽으로)
                        && explosionY < boomBoard.length)

                        if (explosionX >= 0  // 맨 처음 0,0 보다는 커야 함.
                            && explosionY >= 0)
                            boomBoard[explosionX][explosionY] = 1;  // 위험 지역은 1로 표시
                }
            }
        }
    }


