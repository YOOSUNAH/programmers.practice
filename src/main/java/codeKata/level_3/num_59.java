package codeKata.level_3;

// 덧칠하기
public class num_59 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        sol(n, m, section);
    }

        public static int sol(int n, int m, int[] section) {
            int answer = 1;
            int start = section[0];
            int end = section[0] + (m - 1);  // 롤러길이만큼

            for (int x : section) {
                if( start <= x && x <= end){
                    continue;  // answer = 1
                }
                start = x;
                end = x + (m-1);
                answer++;  // 덧칠해줘야하는 경우 더하기
            }
            System.out.println(answer);
            return answer;
        }
}
