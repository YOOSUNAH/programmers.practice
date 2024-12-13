package codeKata.level_4;

public class Num_76 {

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        solution(s);
    }

    public static String solution(String s){
        String answer = "";

        String[] arr = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss: arr) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ");
        }

        System.out.println(answer);
        return answer;
    }
}
