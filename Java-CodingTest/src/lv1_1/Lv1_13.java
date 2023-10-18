package lv1_1;

// 09.25 - 두 정수 사이의 합
// 주어진 정수 a,b 사이에 속한 모든 정수의 합을 리턴하는 함수
public class Lv1_13 {
    public static void main(String[] args) {
        System.out.println(solution(-1, 10000000));
    }
    // 통과 (0.10ms, 82.4MB), 통과 (12.55ms, 85MB)
    public static long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        // a가 b보다 클 경우
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // 1. a부터 b까지 더하기
        for(int i = a; i <= b; i++) {
            answer += i;
        }

        // 2. 등차수열의 합을 생각해서 (a + b) * (b - a + 1) / 2 계산
        // 틀림 -1, 10000000일 때 왜 틀리는걸까?
//        answer = (long)((a + b) * (double)((b - a + 1) / 2));
        return answer;
    }

}
