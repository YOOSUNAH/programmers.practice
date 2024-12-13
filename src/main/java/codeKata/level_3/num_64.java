package codeKata.level_3;

import java.util.Arrays;

// 체육복
public class num_64 {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
//        solution1(n, lost, reserve);
       solution2(n, lost, reserve);
    }


    public static int solution1(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
    public static int solution2(int n, int[] lost, int[] reserve) {
        int[] people = new int[n]; // {_, __, _, _, _}
        int answer = n;  // 최대값

        for (int l : lost)  // lost = {2, 4}
            people[l-1]--;  // 2 - 1 = 1,  4 - 1 = 3   {_, -1, _, -1, _}
        for (int r : reserve) // reserve = {3}
            people[r-1]++; // 3 - 1 = 2   {_, -1, +1, -1, _}

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {  //  {_, -1, +1, -1, _}  i = 1, 3일때
                if(i-1>=0 && people[i-1] == 1) {  // 1 -1 = 0 &  i-1 = 0 그게 1인가, 3 - 1 = 2, i-1 = 2가 1인가 (yes)
                    people[i]++; // -1에다가 +1을 해준다. (체육복을 빌려 받음)
                    people[i-1]--;   // i -1 은 체육복을 빌려줬으니 -1 한다.
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;  // 체육복을 못 빌렸다면 -1
            }

        }
        System.out.println(answer);
        return answer;
    }
}

