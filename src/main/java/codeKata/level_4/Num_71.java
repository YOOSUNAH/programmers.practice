package codeKata.level_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

// 개인정보 수집 유효기간
public class Num_71 {

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"} ;
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        solution3(today, terms, privacies);
    }
    public static List<Integer> solution1(String today, String[] terms, String[] privacies) {
        // int[]
        //        int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> termsMap = new HashMap<>();
        HashMap<String, Integer> privaciesMap = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String t = Arrays.toString(terms[i].split(" "));
            System.out.println("t | " + t); // A,6    B,12   C,3
        }

        for (int i = 0; i < privacies.length; i++) {
            String p = Arrays.toString(privacies[i].split(" "));
            System.out.println("p | " + p);  //2021.05.02, A
                if(privaciesMap.get(i).equals("A")){
                    termsMap.get("A");
                }      
            }
        System.out.println(answer.toString());
        return answer;
    }
    // ==============================================
    public static int[] solution2(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        int date = getDate(today);

        for (String s : terms) {
            String[] term = s.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
    }
    private static int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
    // ==============================================
    public static int[] solution3(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answerList = new ArrayList<>();
        HashMap<String, Integer> termsMap = new HashMap<>();
        for(String item : terms){
            String[] temp = item.split(" ");  // "A 6" -> A, 6
            termsMap.put(temp[0], Integer.parseInt(temp[1])); //  (A,6)  (약관종류,유효기간)
        }

        // 오늘 날짜 구하기
        String[] todayArr = today.split("\\."); // "2022" "05" "19"
        // 연월일을 총 날짜수로 변환하는 식 :  (연도 * 12개월 * 28일) + (월 * 28일) + 일
        int todayDate = (Integer.parseInt(todayArr[0]) * 12 * 28) + (Integer.parseInt(todayArr[1]) * 28) + (Integer.parseInt(todayArr[2]));

        for (int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");  // "2021.05.02"  "A"
            String[] date = temp[0].split("\\.");  // 2021, 05, 02

            int year = Integer.parseInt(date[0]); //2021
            int month = Integer.parseInt(date[1]) + termsMap.get(temp[1]); // 05
            int day = Integer.parseInt(date[2]); // 02

            // 연월일을 총 날짜수로 변환하는 식 :  (연도 * 12개월 * 28일) + (월 * 28일) + 일
            int updateDay = (year * 12 * 28) + (month * 28) + day;
            if(updateDay <= todayDate){  // updateDaty(파기해야하는 날짜) <= 현재 이면, 파기해야한다.
                answerList.add(i + 1);  // 파기 목록
            }
        }

        // List를 int[]로 변경하기
        System.out.println(answerList.toString());
        return answerList.stream().flatMapToInt(IntStream::of).toArray();
    }
}
