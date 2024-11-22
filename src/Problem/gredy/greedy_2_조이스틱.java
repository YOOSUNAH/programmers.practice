package Problem.gredy;

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

        // 1. 상하로 움직이는 부분을 더하는 부분
        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1); // A로 부터 몇번 위로 이동 하는지, Z로부터 몇번 아래로 이동하는지 비교
            index = i + 1;

            // 2. 연속되는 A 갯수 확인
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            // 3. 좌우 이동 수가 적은 방법을 선택하는 부분 // 순서대로 가는 것과, 뒤로 돌아가는 것  비교
            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }

        return answer + move;
    }
}
