package Problem.num_1_100.num_71_80;

public class num_80_polynomial {
    public static void main(String[] args) {

        String s = "3x + 7 + x";
        Solution.solution(s);
    }
    class Solution {
        public static String solution(String polynomial) {
            String answer = "";

            String[] arr = polynomial.split(" ");
//            System.out.println(arr);

            int countN = 0;
            String[] numarr = new String[countN];
            int countX = 0;
            String[] xarr= new String[countX];

            for (int i = 0; i < arr.length; i++){
                if (arr[i].contains("x")) {
                    numarr[i] = arr[i];
                    countN++;
                }
                else{
                    xarr[i] = arr[i];
                    countX++;
                }
            }
            int totalX = 0;
            for (int i = 0; i < xarr.length; i++){
                totalX += Integer.parseInt(xarr[i]);
            }
            int totalN = 0;
            for (int i = 0; i < numarr.length; i++){
                  totalN += Integer.parseInt(numarr[i]);
            }

            int len = 0;
            if (totalX > 0) {
                len = 1;
            }else {
                len = 0;
            }
            String[] beforeAnwer = new String[len];
            beforeAnwer[0] = String.valueOf(totalX);
            beforeAnwer[1] = String.valueOf(totalN);

            answer = String.join("+", beforeAnwer);

            return answer;
        }
    }

    class Solution2{
        public String solution(String polynomial) {
            int xNum = 0;
            int num = 0;

            for (String s : polynomial.split(" ")) {
                if (s.contains("x")) // x가 있으면
                    xNum +=
                            s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
                else if (!s.equals("+"))
                    num += Integer.parseInt(s);
            }

            return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")
                    + (num != 0 ? (xNum != 0 ? " + " : "")
                    + num : xNum == 0 ? "0" : "");
        }


    }


    class Solution3 {
        public String solution(String polynomial) {
            String answer = "";
            int x = 0;  //~x값
            int n = 0;  //정수

            String[] str = polynomial.split(" ");
            for(int i=0; i<str.length; i++){
                if(str[i].contains("x")){   //x가 있을 경우
                    x += str[i].equals("x") ? 1 : Integer.parseInt(str[i].replace("x", ""));  // x랑 똑같으면 1, 아니면 x를 없애서 숫자 형태로 저장.
                }else if(!str[i].equals("+")){ // x가 아니면 "+" 이거나 정수임, 그래서 "+"가 아니라면 으로 조건으로 줘서 정수 갯수를 count 한다.
                    n += Integer.parseInt(str[i]);
                }
            }

            if(x == 1 && n == 0){  // x 합이 1일때, n합은 0  (1은 생략해줘야해서 따로 케이스를 만들어줘야 함)
                answer = "x";
            }else if(x == 1 && n != 0){  // x합이 1일 때, n 합도 있을 때
                answer = "x + " + n;

            }else if(x != 0 && n == 0){  // x합이 1보다 클 때, n합은 0
                answer = x + "x";
            }else if(x != 0 && n != 0){ // x합이 1보다 클 때, n합은 있을 때
                answer = x + "x + " + n;

            }else if(x == 0 && n != 0){  // x합은 0이고, n합은 있을 때
                answer = Integer.toString(n);
            }

            return answer;
        }
    }


}
