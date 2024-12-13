package codeKata.level_3;
//2016년

public class num_54 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        sol(a, b);
    }
        public static String sol(int a, int b) {
            String answer = "";
            int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] arrS = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int sum = 0;

            for (int i = 0; i < a - 1; i++) {  // 3월이면 2월까지
                sum += arr[i];
            }
            sum += b - 1;
            int left = sum % 7 ;
            answer = arrS[left];
            System.out.println(answer);
            return answer;

    }

    }
