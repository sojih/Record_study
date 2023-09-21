package lv1;

//import java.util.*;

public class Lv1_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }

    /** 정수를 담고 있는 배열 arr의 평균값을 return하는 함수 */
    public static double solution(int[] arr) {
        double answer = 0;

        // 평균값 구하기 => 정렬 값을 다 더하고 갯수로 나누기
        for(int item : arr) {
            answer += item;
        }
        answer = answer/arr.length;

        // 라이브러리 사용하기
//        answer = Arrays.stream(arr).average();
        // => 오류
        // OptionalDouble : java.util.OptionalDouble double 값을 가지고 있는지 아닌지를 나타내는 컨테이너 클래스
        //					값의 유무에 따라 추가 메서드가 제공됨
        // double orElse(double other)
        // : 해당 객체 안에 값이 존재하면 그 값 반환, 값 없으면 other 반환

//        answer = Arrays.stream(arr).average().orElse(0);

        return answer;
    }
}
