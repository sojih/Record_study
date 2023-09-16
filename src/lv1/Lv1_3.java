package lv1;

// 짝수와 홀수
public class Lv1_3 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int num) {
        // 삼항연산자 사용 - 통과 (0.02ms, 71.1MB)
//        String answer = (num % 2 == 0) ? "Even" : "Odd";
//        return answer;

        // if문 사용 - 통과 (0.02ms, 72.3MB)
        String answer;
        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
