package lv1;

import java.util.Arrays;
// 틀림! 왜 틀리는거지?

// 10.09 제일 작은 수 제거하기
// 주어진 정수배열 arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수
// (단, 리턴하려는 배열이 빈 배열일 경우 배열에 -1을 채워 리턴, 중복된 수 없음)
public class Lv1_20 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    // 배열의 순서는 일정하지만 가장 작은 수만 제거되어야함
    // => 배열 정렬 후 첫번째 제거x
    // => 주어진 배열보다 길이가 1만큼 작고, 주어진 배열길이가 1일 경우 -1을 채워 리턴
    public static int[] solution(int[] arr) {
        int length = arr.length;
        if(length == 1) {
            return new int[] {-1};
        }
        int s = arr[0];
        int index = 0;
        // 최솟값 인덱스 찾기
        for(int i = 0; i < length; i++) {
            if(arr[i] < s) {
                index = i;
            }
        }

        // 최솟값 인덱스 찾기 - Arrays 함수 사용
//        int index = Arrays.binarySearch(arr, '최솟값');

        // 리턴할 배열
        int[] answer = new int[length - 1];
        for(int i = 0; i < length - 1; i++) {
            if(i < index) {
                answer[i] = arr[i];
            } else if (i > index) {
                answer[i] = arr[i + 1];
            }
        }
        return answer;
    }
}
