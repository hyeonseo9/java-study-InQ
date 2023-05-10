import java.util.Scanner;

public class Week4_10818_ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = -10000000, min = 1000000;

        for (int i = 1; i <= n; i++) {
            int num = s.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.print(min+" "+max);

    }

}