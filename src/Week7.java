import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.Integer;

public class Week7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        /*ArrayList<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }*/
        ArrayList<Treasure> list = new ArrayList<Treasure>();
        ArrayList<Integer> distance = new ArrayList<>();

        Position p = new Position(2, 1);

        // 보물의 x, y, value 값을 입력 받아 거리를 계산하고, 계산값을 ArrayList에 저장 x n번 반복
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            /*for (int j = 0; j < 3 ; j++) { // 보물의 x, y, value 값 저장
                list[i].add(x);
                list[i].add(y);
                list[i].add(value);
            }*/
            list.add(new Treasure(x, y, value));
            distance.add(getDistance(p.x, p.y, list.get(i).x, list.get(i).y));
        }
        int min_dis = 100000;
        int min_index = 100000;
        for (int i = 0; i < n; i++) { // 최소 거리 구하기
            if (distance.get(i) < min_dis) {
                min_dis = distance.get(i);
                min_index = i;
            } else if (distance.get(i) == min_dis) {
                if (list.get(i).value > list.get(min_index).value) {
                    min_dis = distance.get(i);
                    min_index = i;
                } else if (list.get(i).value < list.get(min_index).value) {
                    continue;
                }
            }
        }
        bw.write(list.get(min_index).x+" "+list.get(min_index).y+" "+list.get(min_index).value);
        bw.flush();

    }

    static class Treasure {
        public int x, y, value;
        public Treasure(int x, int y, int value){ // 생성자
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
    static class Position {
        public int x, y;
        public Position(int x, int y) { // 생성자
            this.x = x;
            this.y = y;
        }
    }
    public static int getDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}
