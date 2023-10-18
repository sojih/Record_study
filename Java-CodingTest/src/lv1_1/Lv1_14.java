package lv1_1;

// 0925 - 콜라츠 추측
// 주어진 수가 1이 될 때까지 이 작업을 반복하면 모든 수를 1로 만들수 있다는 추측
// 1-1. 입력된 수가 짝수라면 2로 나눕니다.
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
// => 이 작업을 몇 번 반복해야 하는지 반환(주어진 수가 1이면 0, 500번 이상인 경우 -1 반환)
public class Lv1_14 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    // 통과 (0.02ms, 72.8MB), 통과 (0.05ms, 78.5MB)
    public static int solution(int num) {
        int answer = 0;
        // int의 범위를 넘기는 경우가 있기 때문에 long타입 변수 선언하여 사용
        // (제한사항) 입력된 수, num은 1 이상 8,000,000 미만인 정수
        long n = num;
        // 수가 1이 아닐때만 반복
        while(n != 1) {
            if(answer >= 500) {
                return -1;
            // 짝수이면
            } else if (n % 2 == 0) {
                n /= 2;
            // 홀수이면
            } else {
                n = n * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}
