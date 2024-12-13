package Problem.num_1_100.num_41_50;

public class num_43 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n];
            int index = 0;

            for (int i = 0; i < num_list.length/n; i++){
                for (int j = 0; j < n; j++){
                    answer[i][j] = num_list[index++];
                }
                // i == 0, j == 0, index == 0  :: {{1}, {}, {}, {}}
                // i == 0, j == 1, index == 1  :: {{1, 2}, {}, {}, {}}
                // i == 1, j == 0, index == 2  :: {{1, 2}, {3}, {}, {}}
                // i == 1, j == 1, index == 3  :: {{1, 2}, {3, 4}, {}, {}}
            }
            return answer;
        }
    }
}
