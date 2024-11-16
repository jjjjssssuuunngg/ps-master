// 언어 : JAVA , (성공/실패) : 1/0
// 메모리 : 18652 KB , 시간 : 396 ms

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[31][31];

    public static int combi(int n, int r) {

        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(combi(M, N)+"\n");
        }
        bw.close();
    }
}
