package Problem;


import java.util.*;
/*
 * Greedy 접근법
 * 가장 무거운 사람과 가장 가벼운 사람을 보트에 태워 
 * 한 번에 최대한 많이 구출할 수 있도록 합니다.
 * 
 */

public class greedy_4_구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50,  80, 50};
        int limit = 100;

        System.out.println(solution_greedy(people, limit));
    }

    public static int solution_greedy(int[] people, int limit) {
            int answer = 0;
            int min = 0;
            int max = people.length -1;
            
            // 정렬 먼저 하기 
            Arrays.sort(people);
            
            while(min <= max){
                if(people[min] + people[max] <= limit){
                    min++;
                }
                max--;
                answer++;
            }
            return answer;
    }
}

/*
min = 0, max = 3이니 50 + 80 이 limit을 초과하는지 보고, 아니니
max = 2 가 되고 , answer +1해서 80이 혼자 구명보트를 타게 한 횟수 더하고  
min = 0, max = 2가 비교해서 50 + 70 이 limit을 초과하는지 보고, 아니니
max = 1이 되고,  answer +1해서 70이 혼자 구명보트를 타게 하고 ,
min = 0 하고 max =1 비교해서 50 + 50 이 limit을 초과하지 않으니, 
min을 더하고 max = 0이 되고, answer+1이 되고, 
min <= max 이 어겨져서 while문이 탈출되고, answer이 return 되는 것
*/ 