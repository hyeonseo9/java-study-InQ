import java.util.Scanner;

public class Week5_2720_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int c = s.nextInt();
            System.out.print((c / 25)+" ");
            c %= 25;
            System.out.print((c / 10)+" ");
            c %= 10;
            System.out.print((c / 5)+" ");
            c %= 5;
            System.out.println(c / 1);

        }
    }
}
