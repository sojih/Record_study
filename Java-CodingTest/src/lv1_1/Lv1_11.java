package lv1_1;

import java.util.Arrays;

// 09.22 - 정수 내림차순으로 배치하기
// 입력받은 정수 n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수 리턴
public class Lv1_11 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    /** 리턴 : long / 입력받은 long값의 자릿수를 큰 순서대로 재정렬해서 리턴 */
    public static long solution(long n) {
        long answer = 0;

        // 1. 문자열로 변환 후 정렬, 다시 변환
//        String s = Long.toString(n);
        // 문자 하나 단위로 나눠서 String 타입 배열로 만들기
//        String[] sArr = s.split("");
//        Arrays.sort(sArr);
//        String sortS = "";
//        StringBuffer sb = new StringBuffer(sortS);
//        for(String item : sArr) {
//            sortS += item;
            //Reports String concatenation in loops.
            //As every String concatenation copies the whole string,
            // usually it is preferable to replace it with explicit calls to
            // StringBuilder.append() or StringBuffer.append().
            // 그리고 후에 toString() 작업을 해야함
            // => String str = "";

            //  StringBuilder strBuilder = new StringBuilder(str);
            //  for(int i = 0; i<10; i++) {
            //    strBuilder.append(i);
            //  }
            //  str = strBuilder.toString();
//            sb.append(item);
//        }
//        sortS = sb.toString();
//        answer = Long.parseLong(sortS);

        // 2. 배열로 받아 치환
        // 2-1. Arrays 함수 사용해 순서 변경 - 통과 (0.42ms, 72MB), 통과 (0.43ms, 71.6MB)
        // 자릿수 구하기
        int num = (int)Math.log10(n) + 1;   // log10() : double을 리턴

        // int형 배열과 long 배열을 사용할 때 뭐가 더 효율적일지 궁금
//        int[] arr = new int[num];
        long[] arr = new long[num];
        for(int i = 0; i < num; i++) {
//            arr[i] = (int)n % 10;
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        for(int i = 0; i < num; i++) {
            answer += arr[i] * (long)Math.pow(10, i);
        }
        // 2-2. 크기 비교하는 함수 선택 ->오래걸릴 듯


        return answer;
    }
}
