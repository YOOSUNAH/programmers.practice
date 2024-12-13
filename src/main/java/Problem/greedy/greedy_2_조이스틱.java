package Problem;


// ▲ - 다음 알파벳
// ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
// ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
// ▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)

public class greedy_2_조이스틱 {
    public static void main(String[] args) {
        String name = "JEROEN";


        System.out.println(solution_greedy(name));
    }

    public static int solution_greedy(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값 확인 때 사용
        int move = length - 1; // 좌우 움직임 체크 // 오른쪽 끝까지 이동하는 경우의 기본 거리

        // 1. 상하로 움직이는 부분을 더하는 부분 입니다.
        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            // A로 부터 몇번 위로 이동 하는지, Z로부터 몇번 아래로 이동하는지 비교해서
            index = i + 1;

            // 2. 연속되는 A 갯수 확인 
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }

            // 3. (좌우)이동 수가 적은 방법을 선택하는 부분입니다.
            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }
        
        return answer + move;
    }
}

