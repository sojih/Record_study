package lv1_1;

// 10.04 - 핸드폰 번호 가리기
// 문자열로 주어지는 전화번호의 뒷자리 4자리를 제외한 나머지 숫자를 전부 "*"로 가린 문자열 리턴
public class Lv1_18 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        String answer = "";
        // 1. 문자열을 나누어서 문자열배열을 만든 후 반복문을 통해 앞의 7자리 변환 후 한 문자열로 변환
        // - 통과 (0.17ms, 73.6MB),	통과 (0.23ms, 74.2MB)
        String[] arr = phone_number.split("");
        for(int i = 0; i < arr.length - 4; i++) {
            arr[i] = "*";
        }
        // 문자열배열을 문자열로 변환하는 방법 2 - String클래스 join() 메서드
        answer = String.join("", arr);
        return answer;
        // 2. 문자열의 길이를 구한 후 길이 -4만큼은 "*"를 찍고 뒤에는 4자리 그대로 붙혀주기
        // - 통과 (0.03ms, 71.8MB),	통과 (0.08ms, 77.6MB)
//        int length = phone_number.length();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < length; i++) {
//            if(i < length - 4) {
//                sb.append("*");
//            } else {
//                sb.append(phone_number.charAt(i));
//            }
//        }
//        return sb.toString();
    }
}

// 문자열배열 -> 문자열로 변환 방법
// 1. Arrays 클래스 toString() 메서드 사용 (리턴 : [Hello, Java])
// 2. StringBuilder 클래스 append() 메서드 사용 (후에 toString() 메서드를 사용해 String으로 변환해야함)
// 3. String 클래스 join() 메서드 사용 (파라미터2개 : 구분기호, 문자열 배열)
// 4. StreamAPI의 Collectors.joining() 메서드 사용
//   => String arr = Arrays.stream(strArray) // 문자열 배열 전달
//                          .collect(Collectors.joining()); // 문자열 배열을 Join

// https://developer-talk.tistory.com/451 참고

// 그외 풀이
// 1. String.valueOf() 사용 - 파라미터로 받는 배열을 문자열로 리턴
// 2. 정규식 사용
// return phone_number.replaceAll(".(?=.{4})", "*");
//  => 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
