package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2828 {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 스크린 총 칸
		int m = Integer.parseInt(st.nextToken()); // 바구니 칸
		
		int count = Integer.parseInt(br.readLine()); // 사과 개수
		
		int start = 1; //바구니 시작위치
		int end = m; // 바구니 끝위치
		
		int result =0;
		
		for (int i = 0; i < count; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (start > apple) { //왼쪽으로 이동
                result += start - apple;
                end -= start - apple;
                start = apple;
            } else if (end < apple) { //오른쪽으로 이동
                result += apple - end;
                start += apple - end;
                end = apple;
            }
        }  
		
		System.out.print(result);

		
	}

}
