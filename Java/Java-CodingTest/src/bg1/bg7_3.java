package bg1;

import java.io.*;

// 09.26 2차원배열 - 3. 세로읽기
public class bg7_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어지는 다섯줄을 받아
        // 각 줄의 길이를 구해 가장 큰 수만큼 2차원배열 크기를 지정하고
        // split를 이용해 값을 넣은 후에 반복문을 사용해 (길이로 판별해서)값이 있을때만 출력하기
        String[][] sArr = new String[5][];
        int max = 0;
        for(int i = 0; i < 5; i++) {
            String s = br.readLine();
            sArr[i] = s.split("");
            if(sArr[i].length > max) {
                max = sArr[i].length;
            }
        }
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < 5; j++) {
                if(sArr[j].length > i) {
                    bw.write(sArr[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
