package lv1_1;

// 문자열을 정수로 바꾸기 - 문자열 s를 숫자로 return
public class Lv1_8 {
    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    /** 문자열 s를 숫자로 return */
    public static int solution(String s) {
//        int answer = 0;
        // 1. Integer 함수
        int answer = Integer.parseInt(s);

        // 2. chatAt 사용해서 부호를 구한 후
        char sign = s.charAt(0);
        // 불필요하다고 생각함

        return answer;
    }
}
