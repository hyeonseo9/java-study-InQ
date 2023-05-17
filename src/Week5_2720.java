import java.io.*;

public class Week5_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(c / 25)+" ");
            c %= 25;
            bw.write(String.valueOf(c / 10)+" ");
            c %= 10;
            bw.write(String.valueOf(c / 5)+" ");
            c %= 5;
            bw.write(String.valueOf(c / 1)+"\n");

        }
        bw.flush();
    }
}
