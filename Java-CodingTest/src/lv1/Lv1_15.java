package lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 09.28 서울에서 김서방 찾기
// - seoul이라는 String[] 에서 "Kim"의 위치를 출력하기
public class Lv1_15 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] seoul = {"Jane", "Kim"};
        bw.write(solution(seoul));
        bw.flush();
        bw.close();
    }

    public static String solution(String[] seoul) {
        // 1. 반복문을 사용하여 "Kim"이랑 같은 문자열의 위치 반환 - 통과 (8.99ms, 77.4MB)
        int i = 0;
//        while (!seoul[i].equals("Kim")) {
//            i++;
//        }
        // 1-1. for문 사용하면 시간 차이가 나나? - 통과 (8.04ms, 75.7MB), 통과 (6.38ms, 74.9MB) (엄청난 차이는 모르겠음)
        for(String e : seoul) {
            if(e.equals("Kim")) {
                break;
            }
            i++;
        }

        // 2. 배열에서 일치하는 요소 찾고 인덱스 반환 - 통과 (5.67ms, 81.9MB), 통과 (9.46ms, 79.9MB)
//        int i = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + i + "에 있다";
    }
}
