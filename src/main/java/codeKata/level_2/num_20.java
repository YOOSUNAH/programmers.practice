package codeKata.level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


// 정수 내림차순으로 배치하기
// 함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
public class num_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        methodA(n);
    }

    public static long methodA(long n){
            long answer = 0;
            String srtN = String.valueOf(n);
            String[] array = srtN.split("");
            Arrays.sort(array, Collections.reverseOrder()); // 배열 내림차순으로 정렬
            // 다시 합친 다음에 정수로
            StringBuilder str = new StringBuilder();
            for (String s : array) {
                str.append(s);
            }
             answer = Long.parseLong(String.valueOf(str));
//           System.out.println(answer);
            return answer;
    }
}






