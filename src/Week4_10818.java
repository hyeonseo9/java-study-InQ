import java.io.*;
import java.util.StringTokenizer;

public class Week4_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int max = -10000000, min = 1000000;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        bw.write(String.valueOf(min)+" "+String.valueOf(max));
        bw.flush();
    }
}
