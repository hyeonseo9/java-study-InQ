import java.io.*;
import java.util.StringTokenizer;

public class Week6_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int alpha[] = new int[26];

        for (int i = 0; i<str.length(); i++) {
            int a = Character.toUpperCase(str.charAt(i)) - 'A';
            alpha[a] += 1;
        }
        char result = '?';
        int max = -1;
        for (int i = 0; i < 26; i++){
            if (alpha[i] > max){
                max = alpha[i];
                result = (char)(i + 'A');
            }
            else if (alpha[i] == max){
                result = '?';
            }
        }
        bw.write(result);
        bw.flush();

    }
}
