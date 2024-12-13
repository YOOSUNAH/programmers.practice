package Problem;

// ▲ - 다음 알파벳
// ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
// ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
// ▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)

public class greedy_2_조이스틱_pr {

    public static void main(String[] args) {
        String name = "JEROEN";

        System.out.println(solution_greedy(name));
    }

    public static int solution_greedy(String name) {
        int answer = 0;
        int len = name.length();

        int index;
        int minMove = len - 1;

         // 1. 상하로 움직이는 부분을 더하는 부분
         for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            index = i + 1;

            // 2. 연속되는 A 갯수 확인
             while(index < len && name.charAt(index) == 'A'){
                index++;
             }

           // 3. 좌우 이동 수가 적은 방법을 선택하는 부분
            minMove = Math.min(minMove, i * 2 + (len - index));
            minMove = Math.min(minMove, (len - index) * 2 + i );
         }    
        return answer + minMove;
    }

    public static int sol2(String name){
        int answer = 0;
        int length = name.length();
        // 알파벳 변경에 필요한 조작 횟수 계산
        for (int i = 0; i < length ; i++) {
            char c = name.charAt(i);
            int upDownMoves = Math.min(c - 'A', 'Z' - c + 1);
            answer += upDownMoves;
        }

        // 좌우 이동에 필요한 최적의 거리 계산
        int minMove = length - 1; // 오른쪽 끝까지 이동하는 경우의 기본 거리

        for (int i = 0; i < length; i++) {
            if (name.charAt(i) == 'A') {
                int nextIndex = i + 1;

                // 연속된 A 구간의 끝까지 찾기
                while (nextIndex < length && name.charAt(nextIndex) == 'A') {
                    nextIndex++;
                }

                // 현재 위치에서 연속된 A 구간을 돌아서 가는 경우의 최소 이동 거리
                int move = (i * 2) + length - nextIndex;
                minMove = Math.min(minMove, move);
            }
        }

        answer += minMove;
        return answer;
    }
}

