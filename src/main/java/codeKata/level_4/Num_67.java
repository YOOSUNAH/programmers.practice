package codeKata.level_4;
// 둘만의 암호
public class Num_67 {

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        solution(s, skip, index);
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        //조건 1. 문자열 s, skip, 정수 index가 주어진다.
        //조건 2. 문자열 s의 각 자리 알파벳을 index만큼 건너뛴 문자열을 리턴한다.
        //조건 3. 만약 s의 각 자리 알파벳이 skip에 포함되면 그 경우는 제외하고 건너뛴다.
        //조건 4. 알파벳이 'z'를 넘어가면 'a'로 돌아가게 해준다.

        for (int i = 0; i < s.length(); i++) {  //aukks
            char stringStoChar = s.charAt(i);  //a, u, k, k, s
            int count = 1;

            while (count <= index) {  // 5만큼 더해줘
                ++stringStoChar; // 다음 알파벳
//                System.out.println("count : " + count + ", stringStoChar : "+ stringStoChar );

                if (stringStoChar > 'z') // Z 넘으면 다시 A로 되게
                    stringStoChar -= 26;
                if (skip.contains(stringStoChar + "")) {  //wbqd 중에 있으면
                    //contains는  CharSequence 가 와야해서 위에처럼 문자열로 반환해주거나
                    // 아래처럼 바꿔주거나!
                    //if (skip.contains(String.valueOf(stringStoChar))) {

//                    System.out.println("skip : " + (stringStoChar+"") );
                    continue; // 지나치고
                } else
                    count++; // 없으면 count를 더해줘
            }

            answer += stringStoChar; // 알파벳 h a p p y
        }
        // System.out.println(answer);
        return answer;
    }

    // 다른 풀이
    public String solution2(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}
