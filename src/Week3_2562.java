import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.*;

public class Week3_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0, num, index = 0;

        for (int i = 0; i < 9; i++) {

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            num = Integer.parseInt(st.nextToken());

            if (num > max) {
                max = num;
                index = i + 1;
            }
        }

        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(index));
        bw.flush();

    }

}