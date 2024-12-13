package codeKata.level_2;

import java.util.Scanner;

public class num_38 {
// 직사각형 별찍기
    class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();  // 한줄 넘겨주기
            }
        }
    }
}
