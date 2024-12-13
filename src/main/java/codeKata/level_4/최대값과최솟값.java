package codeKata.level_4;

public class 최대값과최솟값 {

    public static void main(String[] args) {
        String s = "1 2 3 4";
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sArr.length; i++) {
            int minX = Integer.parseInt(sArr[i]);
            int[] sIntArr = new int[sArr.length];
            sIntArr[i] = minX;

            min = Math.min(sIntArr[i], min);
            max = Math.max(sIntArr[i], max);
        }

        answer +=  String.valueOf(min);
        answer +=  " ";
        answer +=  String.valueOf(max);

        System.out.println(answer);
        return answer;
    }
}
