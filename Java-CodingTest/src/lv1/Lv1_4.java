package lv1;

// 자릿수 더하기
public class Lv1_4 {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }
    /** 주어진 자연수의 각 자릿수의 합을 return하는 함수 */
    public static int solution(int n) {
        int answer = 0;

        // 1. while문을 사용하여 % 10이 0이 아닐 때까지 반복
        while(n >= 10) {
            answer += n % 10;
            n /= 10;
        }
        answer += n;

        // 2. 문자열로 변환해서 각 단위를 다시 숫자로 치환, 값 더하기 => 굳이?


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
