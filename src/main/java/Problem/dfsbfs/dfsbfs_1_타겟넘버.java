package Problem.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class dfsbfs_1_타겟넘버 {

    public static void main(String[] args) {
        int[] listA = {1, 1, 1, 1, 1};
        int target = 3;

        int[] listB = {4, 1, 2, 1};
        int target2 = 4;

        System.out.println(solutionBFS(listA, target));
        System.out.println(solutionBFS(listB, target2));

        System.out.println(solutionDFS(listA, target));;
        System.out.println(solutionDFS(listB, target2));
    }

    //  bfs ---
    public static int solutionBFS(int[] numbers, int target) {  // solutionBFS -> solution으로 변경해서 제출해야함.
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        // 초기값 0 삽입
        queue.add(0);

        for (int i = 0; i < numbers.length; i++) {
            int size = queue.size(); // 1 -> 2 -> 4 -> 8
            for (int j = 0; j < size; j++) { // 2일때는 0, 1 꺼내기
                int sum = queue.poll(); // queue = {4 , -4} , 4꺼내기 , -4꺼내기

                queue.add(sum + numbers[i]); //  -4 + 1 number[1] = 1
                queue.add(sum - numbers[i]); //  -4 - 1
            }
        }
        // queue에 경우의 수들이 추가됨.

        while (!queue.isEmpty()) { // queue가 빌때 까지
            if (queue.poll() == target) { // queue를 꺼내면서, target이랑 같은 경우면,
                answer++; // answer 추가해준다.
            }
        }
        return answer;
    }

//  dfs  ---
   private static int answer = 0;

    public static int solutionDFS(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return answer;
    }

    private static void dfs(int depth, int[] numbers, int target, int sum) {
        // 깊이 만큼 다 돈경우, 멈추고, 결과를 반환
        if (depth == numbers.length) { // 마지막 노드까지 탐색한 경우,
            if (target == sum) { // 그때 sum이 target과 같으면
                answer++;  // answer 증가,
            }
        } else {
            dfs(depth + 1, numbers, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(depth + 1, numbers, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }

        // 0 +4
        // 0 -4

        //  0 +4 +1
        //  0 +4 -1
        //  0 -4 +1
        //  0 -4 -1

        // 0 +4 +1 +2
        // 0 +4 +1 -2
        // 0 +4 -1 +2
        // 0 +4 -1 -2
        ///...
    }

}
