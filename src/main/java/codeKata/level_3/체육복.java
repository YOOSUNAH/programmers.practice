package codeKata.level_3;

public class 체육복 {

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        solution(n, lost, reserve);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];  // n =5  {_,_,_,_,_}
        int answer = n;  // 최대 인원

        for (int l : lost) {
            student[l - 1]--;    // {_,-1,_,-1,_}
        }
        for (int r : reserve) {
            student[r - 1]++;   // {+1,-1,+1,-1,+1}
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] == -1) {
                if ((i - 1) >= 0 && student[i - 1] == 1) {   //
                    student[i]++;   // -1에다가 +1을 해준다. (체육복을 빌려 받음)
                    student[i - 1]--; // i -1 은 체육복을 빌려줬으니 -1 한다.
                } else if ((i + 1) < student.length && student[i + 1] == 1) {
                    student[i]++;
                    student[i + 1]--;
                } else
                    answer--; // 체육복을 못 빌렸다면 -1
            }
        }
//        System.out.println(answer);
        return answer;
    }
}


