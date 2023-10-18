package lv1_1;

// 09.30 음양 더하기
// 정수 배열 absolutes와 부호 배열 signs(둘다 길이 1000이하) => 실제 합 구하기
public class Lv1_16 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // 1. if문 사용 통과 (0.04ms, 73.7MB), 통과 (0.07ms, 76.8MB)
//        for(int i = 0; i < absolutes.length; i++) {
//            if(signs[i]) {
//                answer += absolutes[i];
//            } else {
//                answer -= absolutes[i];
//            }
//        }
        // 2. 삼항연산자 - (다른 테스트 케이스이지만)통과 (0.07ms, 78.5MB), 통과 (1.12ms, 67MB)
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i] ? absolutes[i] : -absolutes[i]);
        }
        return answer;
    }
}
