import java.io.*;
import java.util.Scanner;

public class Week5_10988_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int result = 1;

        for (int i = 0; i<(str.length()/2); i++) {
            char a = str.charAt(i);
            char b = str.charAt(str.length()-i-1);

            if (a == b) {
                result = 1;
                continue;
            }
            else {
                result = 0;
                break;
            }
        }
        bw.write(String.valueOf(result)+"\n");
        bw.flush();

    }
}
