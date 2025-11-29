package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1652_clunky {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		// 연속으로 두칸이상을 판별하기
		// . 이 i == i+1 이면서 둘다 .일때, 그리고
		// 만약 ..x.. 이면 두자리잖아 x가 중간에 있을때만 가능

		// 1. 각 행에서 첫번째 x가 언제 나오는지 탐색
		// 2. 각 열에서 첫번째 x가 언제 나오는지 탐색
		// 3. x간의 거리를 구해야되나?

		int[][] arr = new int[count][count];

//		int rowIndexOfX = 0;
//		int colIndexOfX = 0;

		for (int i = 0; i < arr.length; i++) {
			String st = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (st.charAt(j) == 'X') ? 1 : 0;

			}
		}


		// 지나온 길을 세는 temp하나 만들고 이게 2칸이상되다가 x만나면 초기화하고 자리 +1
		int temp = 0;
		int rowSit = 0;

		for (int i = 0; i < arr.length; i++) {
			temp=0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					if(temp==count) {
						// 단 하나의 X도 만나지 못할 경우 
						// temp는 count숫자까지 계속 오름
						rowSit++;
						temp=0;
						continue;
					}		
					// x를 만날 때까지 temp를 올리다가
					temp++;
					if((j==arr[i].length-1) &&temp>=2) {
						//끝에 도달했는데 temp가 2칸이상이면
						rowSit++;
						temp=0;
					} 
							
					
				} else if (arr[i][j] == 1) {
					// x를 만나면 && temp가 두칸이상이다 ->자리 개수++
					if (temp >= 2) {
						temp = 0;
						rowSit++;
					}
					temp = 0; // x를 만나면 어쨌든 temp는 초기화해야 함

				}

			}
		}
		
		int temp2 = 0;
		int colSit = 0;
		for (int i = 0; i < arr.length; i++) {
			temp2=0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] == 0) {
					if(temp2==count) {
						
						// 단 하나의 X도 만나지 못할 경우 
						// temp는 count숫자까지 계속 오름
						colSit++;
						temp2=0;
						continue;
					}		
					// x를 만날 때까지 temp를 올리다가
					temp2++;
					if((j==arr[j].length-1) &&temp2>=2) {
						//끝에 도달했는데 X를 못 만난 채로 temp가 2칸이상이면
						colSit++;
						temp2=0;
					} 
					
				} else if (arr[j][i] == 1) {
					// x를 만나면 && temp가 두칸이상이다 ->자리 개수++
					if (temp2 >= 2) {
						temp2 = 0;
						colSit++;
					}
					temp2 = 0; // x를 만나면 어쨌든 temp는 초기화해야 함

				}

			}
		}
		
		System.out.print(rowSit+" ");
		System.out.print(colSit);
		

		
		
		

	}

}
