package lv1_2;

// 10.23 - 가운데 글자 가져오기
// 단어 s의 가운데 글자 반환(단어 길이가 짝수면 가운데 두 글자 반환)
public class lv1_1 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        int length = s.length();
        System.out.println("길이 : " + length);
        if(length % 2 == 0) {
            // 짝수이면
            answer = s.substring(length / 2 - 1, length / 2 + 1);
        } else {
            // 홀수이면
            answer = Character.toString(s.charAt(length / 2));
            // 이렇게도 가능
//            answer = s.substring(length / 2 - 1, length / 2);
        }
        return answer;
    }
}
