package Algorithm;

import java.util.Arrays;
import java.util.Collections;

// 10.24 프로그래머스 고난이도 - 배열 2. 가장 큰 수
// 0 또는 양의 정수가 주어질 때 정수를 이어 붙여 만들 수 있는 가장 큰 수 리턴
// 주어지는 배열 길이는 1이상 100,000이하, 원소는 0이상 1,000이하, 정답이 클 수 있으니 String타입으로 리턴
public class P_array_2 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        P_array_2 p = new P_array_2();
        System.out.println(p.solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = "";
        
        // 602와 68, 6이 있을 때 686602가 제일 큼
        // => 첫번째 자리 비교 - 하나만 크면 그게 먼저 - 같으면
        // => 두번째 숫자 비교 - 두번째 숫자가 큰것 먼저, 두번째 숫자가 없으면 다른 숫자가 첫번째 숫자보다 클 경우 뒤로, 아닐경우 앞으로

        // 이거말고 나오는 경우의 수를 다 만든 다음 가장 높은 수를 리턴?
        // => 그러면 반복문을 돌리기가.. 모든 경우의 수 돌리기 => 너무 오래걸릴 듯

        // 두 수를 붙혔을 때 더 크게 나오는 경우로 채택하기
        // int -> String 방법 1. Integer.toString(int) 2. Integer.valueOf(int) 3. int + ""
        int num = numbers.length;
        String[] temp = new String[num];
        for(int i = 0; i < num; i++) {
            temp[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(temp, Collections.reverseOrder());

        if(temp[0] == "0") {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String e : temp) {
            sb.append(e);
        }
        answer = sb.toString();

        return answer;
    }
}
