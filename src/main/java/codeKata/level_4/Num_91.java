package codeKata.level_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 기능 개발
public class Num_91 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        solution2(progresses, speeds);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int[] day = new int[progresses.length];

        for (int i = 0; i < day.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                day[i] = (100 - progresses[i]) / speeds[i];
            } else {
                day[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
            q.add(day[i]);
        }

        List<Integer> list = new ArrayList<>();
        int cnt = 0; // 한번 배포시 배포되는 기능 카운트
        int before = q.peek(); // 첫 기능이 배포되는데 걸리는 기간
        // 큐가 빌때까지 반복
        while (!q.isEmpty()) {
            // 배포에 걸리는 기간
            // 현재 큐의 맨앞에 있는 요소가 이전에 조회한 값보다 이전보다 작거나 같으면, 같은날 배포될 수 있다.
            if (q.peek() <= before) {
                q.poll();  // 큐에서 제거
                cnt++;     // 기능 증가
            } else {
                // 현재 큐의 맨앞에 있는 요소가 이전에 조회한 값보다 크다면, 다음 배포
                // 이전까지 카운트한 기능수를 list에 저장하고,  기능 갯수 다시 한개 추가 ,
                list.add(cnt);
                cnt = 1;
                // 새로운 배포일을 기준으로 삼기 위해서 이전값을 현재 큐의 값으로 업데이트하고, 큐에서 해당값을 제거
                // queue에서 제거함과 동시에 before 값으로 세팅
                before = q.poll();
            }
        }
        // 배포된 기능 수를 list에 추가
        list.add(cnt);

        // answer 배열에 복사
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int[] day = new int[progresses.length];
        for (int i = 0; i < day.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {  // 나머지가 0일때
                day[i] = (100 - progresses[i] / speeds[i]);
            } else {  // 나머지가 0이 아니면
                day[i] = (100 - progresses[i] / speeds[i]) + 1;
            }
            q.add(day[i]);
        }
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int before = q.peek(); // 가장 처음 입력된 것 조회  // 7
        // 큐가 빌때 까지 반복
        while(!q.isEmpty()){
            //  현재 작업의 배포일이 이전에 조회된 배포일보다 크거나 같으면
            if(before >= q.peek()){  // before: 7  >= q.peek() : 7  // before은 안바뀜, 그대로 7 >= 3
                // q에서 제거
                q.poll();    // 7, 3, 9 중에서 7 제거 // 3, 9 중에서 3제거
                cnt++;       // 1  // cnt = 2
            }else{  // before < q.peek()    //  7 < 9
                list.add(cnt);  // 그동안 카운트 된 것 저장
                cnt = 1;        // 카운트 다시 1로 초기화
                before = q.poll(); // before  9로 바꾸기
            }
        }
        list.add(cnt);

        // answer 배열에 복사
        int[]  answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }

}
