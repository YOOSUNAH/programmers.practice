package codeKata.level_3;

// 옹알이 (2)
public class num_62 {

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        solution(babbling);
        solution(babbling2);

        //    solution3(babbling);
      //  solution2(babbling);

        solution3(babbling2);
         solution2(babbling2);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] repeat = {"aya", "ye", "woo", "ma"};
        String[] repeat2 = {"ayaaya", "yeye", "woowoo", "mama"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < repeat.length; j++) {
                if (babbling[i].contains(repeat2[j])){
                    continue;
            }
                babbling[i] = babbling[i].replace(repeat[j], " ");
            }
            // trim으로 공백제거
            if(babbling[i].trim().length() == 0){
                    answer++;
            }
        }
            System.out.println(answer);
            return answer;
    }
    public static int solution3(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
                babbling[i] = babbling[i].replace( "ayaaya", "x");
                babbling[i] = babbling[i].replace( "yeye", "x");
                babbling[i] = babbling[i].replace( "woowoo", "x");
                babbling[i] = babbling[i].replace( "mama", "x");

            babbling[i] = babbling[i].replace( "aya", " ");
            babbling[i] = babbling[i].replace( "ye", " ");
            babbling[i] = babbling[i].replace( "woo", " ");
            babbling[i] = babbling[i].replace( "ma", " ");

            babbling[i] = babbling[i].replace( " ", "");


            // trim으로 공백제거
            if(babbling[i].length() == 0) {
                answer++;
            }
        }
        System.out.println("solution3 : " + answer);
        return answer;
    }

        public static int solution2(String[] babbling) {
            int ans = 0;

            for (int i=0; i<babbling.length; i++){
                babbling[i] = babbling[i].replace("ayaaya", "1");
                babbling[i] = babbling[i].replace("yeye", "1");
                babbling[i] = babbling[i].replace("woowoo", "1");
                babbling[i] = babbling[i].replace("mama", "1");


                babbling[i] = babbling[i].replace("aya", " ");
                babbling[i] = babbling[i].replace("ye", " ");
                babbling[i] = babbling[i].replace("woo", " ");
                babbling[i] = babbling[i].replace("ma", " ");

                babbling[i] = babbling[i].replace(" ","");


                if(babbling[i].length() == 0){
                    ans++;
                }
            }
            System.out.println("solution2 : " + ans);
            return ans;
        }

}
