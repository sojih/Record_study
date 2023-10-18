package lv1_1;

// 10.07 없는 숫자 더하기
// 0 ~ 9까지 숫자가 임의로 들어가 있는 배열 numbers에서 찾을 수 없는 0 ~ 9까지의 숫자 모드 더한 수  리턴
// (1개이상, 중복되지 않음)
public class Lv1_19 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = -1;
        // 1. 배열을 오름차순 정렬 후 반복문을 통해 i와 같지 않을 때의 수 더하기
        // (배열에서 숫자를 빼는 과정도 있어야함)

        // 2. 반복문으로 배열 원소들을 다 더하고 0~9의 합에 빼기
        // 통과 (0.03ms, 83.6MB),	통과 (0.02ms, 77.6MB)
        int total = (0 + 9) * 10 / 2; // 0에서 9까지의 합
        int numbersSum = 0;
        for(int e : numbers) {
            numbersSum += e;
        }
        answer = total - numbersSum;
        return answer;
    }
}
