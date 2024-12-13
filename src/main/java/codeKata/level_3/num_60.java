package codeKata.level_3;

//기사단원의 무기
public class num_60 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
//        solution(number,limit,power);
        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        solution(number2, limit2, power2); //21
        sol(number2, limit2, power2);
    }

    public static int sol(int number, int limit, int power) {
        int answer = 1;                             //1의 약수의 개수 1개
        for(int i=2; i<=number; i++) {              //2부터 number 까지
            int count = 2;                          //2부터는 무조건 약수의 개수가 2 이상이므로
            for(int j=2; j<=Math.sqrt(i); j++) {    //약수의 개수 구하는 for문
                if(i % j == 0) {
                    if(j == Math.sqrt(i)) {
                        count++;
                    }else {
                        count += 2;
                    }
                }
            }
            // limt 을 초과할경우 limt -1, 아닌경우 그냥 본인 숫자
            answer += (count > limit) ? power : count;
        }
        return answer;
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        // 약수 구하기
        for (int i = 1; i <= number; i++) {  // i 가 1, 2, 3, 4, 5 하나씩
            int count = 0;  // 다음 i 때 약수 다시 구하기 위해 reset
            for (int j = 1; j <= i; j++) {  // i의 약수 구하기
                if (i % j == 0) {
                    count++;
                }
            }
            // 시간 초과남...
            // limt 을 초과할경우 limt -1, 아닌경우 그냥 본인 숫자
            answer += (count > limit) ? power : count;
        }
        System.out.println(answer);
        return answer;
    }

}