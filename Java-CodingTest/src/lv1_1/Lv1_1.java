package lv1_1;

public class Lv1_1 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    /** 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수 */
    public static int solution(int n) {
        int answer = 0;

        // 1. 반복문 사용 - 나머지가 0 => 약수이다
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
