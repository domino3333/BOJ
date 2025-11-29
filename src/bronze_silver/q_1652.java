package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1652 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫번째 숫자 N 받고 배열 생성
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][n];

		// 2차원 배열 받기 x는 1로, .은 0으로 삽입
		for (int i = 0; i < n; i++) {
			String st = br.readLine();
			for (int j = 0; j < n; j++) {
				if (st.charAt(j) == 'X') arr[i][j] = 1;
				else arr[i][j] = 0;
			}
		}
		int temp = 0;
		int rowSit=0;
		int temp2 = 0;
		int colSit=0;
		
		//가로탐색
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if(arr[i][j]==0)temp++;
				if(arr[i][j]==1||j==n-1) {// x를 만났거나, 끝에 도달했을 때 한 번 검사를 거치기
					if(temp>=2) rowSit++;
					temp=0;
				} 
			}

		}
		//세로탐색
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if(arr[j][i]==0)temp2++;
				if(arr[j][i]==1||j==n-1) {// x를 만났거나, 끝에 도달했을 때 한 번 검사를 거치기
					if(temp2>=2) colSit++;
					temp2=0;
				} 
			}
			
		}
		
		
		
		System.out.print(rowSit+" ");
		System.out.println(colSit);
		
		
		
		
		

	}

}
