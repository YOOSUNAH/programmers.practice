package codeKata.level_4;

import java.util.ArrayList;
import java.util.List;

public class 이웃한칸 {

    public static void main(String[] args) {
        String[][] board = {
            {"blue", "red", "orange", "red"},
            {"red", "red", "blue", "orange"},
            {"blue", "orange", "red", "red"},
            {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
        solution(board, h, w);

    }


    public static int solution(String[][] board, int h, int w) {
//        int answer = 0;

        int n = board.length;
        int count = 0;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i <= 3; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if ((h_check >= 0 && h_check < n) && (w_check >= 0 && w_check < n)) {

                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

}
