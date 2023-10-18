package lv1_1;

// 정수 제곱근 판별 - 양의 정수 n에 대해 n이 어떤 자연수x의 제곱인지 판단하기
//      - x의 제곱이라면 x+1의 제곱을, 아니라면 -1을 리턴하는 함수
public class Lv1_10 {
    public static void main(String[] args) {
        System.out.println(solution(101));
    }

    public static long solution(long n) {
        // 1. 반복문 사용 - 통과 (0.15ms, 76.8MB),	통과 (10.91ms, 74.5MB)
//        for(long x = 0; x * x <= n; x++) {
//            if(x * x == n) {
//                return (x + 1) * (x + 1);
//            }
//        }
//        return -1;

        // 2. 제곱근 구하는 함수 사용 - 통과 (0.07ms, 73.1MB), 통과 (0.04ms, 79.8MB)
        long x = (long)Math.sqrt(n);
        // double을 리턴하는 Math.sqrt()를 사용하니 101을 넣으면 10.xxx * 10.xxx 값을 101로 생각해서
        // long으로 타입변환 후 제곱을 계산
//        System.out.println("x = " + x);
        if(x * x == n) {
            return (long)Math.pow(x + 1, 2);
        }
        return -1;
    }
}
