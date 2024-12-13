package codeKata.level_3;

// 숫자 짝꿍

public class num_63 {

    public static void main(String[] args) {
        String X = "12321";
        String Y = "42531";
        solution(X, Y); //


    }

    public static String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (String a : X.split("")) {
            arrX[Integer.parseInt(a)]++;
        }

        for (String a : Y.split("")) {
            arrY[Integer.parseInt(a)]++;
        }

        for (int i = 9; i >= 0; i--) {
            while (arrX[i] > 0 && arrY[i] > 0) {
                    sb.append(i);
                    arrX[i]--;
                    arrY[i]--;
                }
            }

        if (sb.length() > 0) {
            answer = sb.charAt(0) == '0' ? "0" : sb.toString();
        }else {
            answer = "-1";
        }
//        System.out.println(answer);
        return answer;
    }
}
