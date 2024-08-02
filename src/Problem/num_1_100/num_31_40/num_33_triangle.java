package Problem.num_1_100.num_31_40;

import java.util.Scanner;

public class num_33_triangle {
    public static void main(String[] args) {

    }

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
