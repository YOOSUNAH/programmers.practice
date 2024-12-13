package codeKata.level_4;

import java.util.Arrays;
import java.util.HashMap;

// 바탕화면 정리
public class Num_70 {

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        solution3(wallpaper);
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        HashMap<Integer, Integer> wallMap = new HashMap<>();
        int rdx = 0;
        int rdy = 0;
        int lux = 0;
        int luy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String wall = Arrays.toString(
                wallpaper[i].split("")); // ".#...",    "..#..",    "...#."
            for (int j = 0; j < wall.length(); j++) {   // .#...
                String[] wList = wall.split("");
                if (wList[j].equals("#")) {
                    wallMap.put(j, j);
                    System.out.println("i | " + i + "j | " + j);
                }


            }

        }
        System.out.println();
        return answer;
    }

    public static int[] solution2(String[] wallpaper) {
        int minRow, minCol;
        int maxRow, maxCol;

        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    minRow = Math.min(minRow, r);

                    minCol = Math.min(minCol, c);

                    maxRow = Math.max(maxRow, r);

                    maxCol = Math.max(maxCol, c);

                }
            }
        }

        //max 값에 + 1을 하는 이유는 드래그를 하려면 끝점을 선택해야 함
        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }

    public static int[] solution3(String[] wallpaper) {
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE,
            Integer.MIN_VALUE};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(i, answer[0]);
                    answer[1] = Math.min(j, answer[1]);
                    answer[2] = Math.max(i + 1, answer[2]);
                    answer[3] = Math.max(j + 1, answer[3]);
                }
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        System.out.println(answer[3]);
        return answer;
    }

    public int[] solution4(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}

