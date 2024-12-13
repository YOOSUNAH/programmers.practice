package codeKata.level_4;


public class 바탕화면정리하기70 {

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        solution(wallpaper);
    }

    public static int[] solution(String[] wallpaper) {
        int lux = 50; // 시1작점  (최대값)   정수의 최대값과 비교했을때 더 작은걸 answer[0]에 집어넣는다.
        int luy = 50;
        int rdx = 0;  // 끝점
        int rdy = 0;
        int[] answer = {lux, luy, rdx, rdy};
//        int[] answer = new int[]{ Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MIN_VALUE, Integer.MIN_VALUE};
     // 정수의 최대값과 비교했을때 더 작은걸 answer[0]에 집어넣는다.

            for (int i = 0; i < wallpaper.length; i++) {
                for (int k = 0; k < wallpaper[i].length(); k++) {
                    String s = wallpaper[i].split("")[k];
                    if (s.equals("#")) {
                        answer[0] = Math.min(answer[0], i);
                        answer[1] = Math.min(answer[1], k);
                        answer[2] = Math.max(answer[2], i + 1);
                        answer[3] = Math.max(answer[3], k + 1);
                    }
                }
            }
    // 답확인
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
