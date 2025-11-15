package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_10539 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째줄 꺼내오기
		int count = Integer.parseInt(br.readLine());
		int[] arr_b= new int[count];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 카운트만큼 숫자 개수 받아오기
		for(int i = 0; i<count; i++) {
			
			
			arr_b[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] arr_result = new int[count];

		int preSum =0;
		
		for(int i = 0; i<count; i++) {

			
			int a = arr_b[i]*(i+1)-preSum;
			
			arr_result[i] =a;
			preSum +=a;
		}


		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<count; i++) {
			sb.append(arr_result[i]).append(" ");

		}
        System.out.print(sb.toString());
		
		
	}

}
