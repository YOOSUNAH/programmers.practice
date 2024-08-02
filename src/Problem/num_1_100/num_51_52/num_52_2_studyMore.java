package Problem.num_1_100.num_51_52;

import java.util.*;

public class num_52_2_studyMore {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();
            List<Integer> prime = new ArrayList<>();
            int count = 0;

            // n의 약수 찾기
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            // n의 약수 중에서 소수 찾기
            for (int i = 0; i < list.size(); i++) {
                for (int j = 2; j <= n; j++) {
                    if (list.get(i) % j == 0) {
                        count += 1;
                    }
                }
                if (count == 1) { // 나누어 떨어지는 수가 자기자신 하나라는 뜻으로 소인수를 담을 prime list에 넣는다.
                    prime.add(list.get(i));
                } // 아니면 count 0으로..
                count = 0;
            }

            // list의 값들을 answer 배열에 넣어줌.
            int[] answer = new int[prime.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = prime.get(i);
            }

            return answer;
        }
    }

    class Solution2 {
        public int[] solution(int n) {
            int[] answer;
            HashMap<Integer, Integer> map = new HashMap<>();
            int index = 0;

            for (int i = 2; i <= n; ) //소인수는 1보다 크기에 2부터 시작
            {
                if (n % i == 0) // 나눠지면 인수라는 것
                {
                    map.put(i, i); //해시맵에 저장
                    n /= i; // n을 소인수로 나누기
                } else // 나눠지지 않으면 i++;
                {
                    i++;
                }

            }

            answer = new int[map.size()]; //해시맵 크기만큼
            for (Integer i : map.keySet()) //배열에 값 넣기
            {
                answer[index] = map.get(i);
                index++;
            }
            Arrays.sort(answer); //해시맵은 정렬된 상태가 아니기 때문에 정렬
            return answer;
        }
    }


    class Solution3 {
        public int[] solution(int n) {
            LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

            int i = 2;
            while (n != 0 && i <= n) {
                if (n % i == 0) {
                    primeNumbers.add(i);
                    n /= i;
                } else {
                    i++;
                }
            }

//        System.out.println(primeNumbers);
            return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
        }
    }


    class Solution4 {
        public int[] solution(int n) {
            int[] answer = {};
            List<Integer> arr = new ArrayList<>();

            int i = 2;
            while (n > 1)
                if (n % i == 0) {
                    arr.add(i);
                    n /= i;
                } else {
                    i++;
                }

            answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
            // .toArray() : ArrayList 를 배열의 형태로 반환해주는 매소드
            // .mapToInt() : 스트림을 IntStream으로 변환해주는 메서드
            // .distinct() : 중복 요소가 없는 고유한 요소로 구성된 새로운 Stream을 반환한다.
            // .stream() : 컬렉션, 배열 등에 저장된 요소들을 하나씩 참조하면서 코드를 실행할 수 있는 기능.

            return answer;
        }
    }

    class Solution5 {
        public int[] solution(int n) {
            int[] answer = {};
            int sum = 0;

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    answer[i - 2] = i;
                    n = n / i;
                }
                for (int j = 0; j < answer.length; j++) {
                    sum *= answer[j];
                }
                if (sum == n)
                    break;

            }
            Arrays.sort(answer);
            return answer;

        }
    }
}
