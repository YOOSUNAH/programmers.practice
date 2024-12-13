package codeKata.level_4;

public class 문자열나누기 {

    public static void main(String[] args) {
        String s = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";

//        solution(s);
        solution2(s);
        solution2(s2);
        solution2(s3);
    }

    public static int solution(String s) {
        int answer = 0;
        char[] c = s.toCharArray();
        char x = c[0];  // b
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if(count == 0){
                answer++;  // 1
                x = c[i];
            }
            if(x == c[i]) {
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static int solution2(String s) {
        int answer = 0;
        int count = 0;
        char[] c = s.toCharArray();
        char x = c[0];

        for (int i = 0; i < c.length; i++) {
            if(count == 0){
                answer++;
                x = c[i];
            }
            if(x == c[i]){
               count++;
           } else{
               count--;
           }
        }
        System.out.println(answer);
        return answer;
    }
}
