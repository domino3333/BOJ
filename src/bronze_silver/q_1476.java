package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int year = 1;
        int a = 1, b = 1, c = 1;

        while (true) {
            if (a == e && b == s && c == m) {
                System.out.println(year);
                break;
            }
            a++; if (a > 15) a = 1;
            b++; if (b > 28) b = 1;
            c++; if (c > 19) c = 1;
            year++;
        }




    }

}

