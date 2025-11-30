package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2816 {

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[]arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		String temp ="";
		for (int i = 0; i < n; i++) {
			if(arr[i].equals("KBS1")&&!(arr[0].equals("KBS1"))) {
				
				for (int j = i; j>0; j--) {
					// i-1과 kbs1을 바꿔주기
					System.out.print(4);
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j]= temp;
				}
				break;
			}else {
				System.out.print(1);
			}
		}
		
		if(arr[1].equals("KBS2")) System.exit(0);
		
		String temp2 = "";
		for (int i = 0; i < n; i++) {		
			if(arr[i].equals("KBS2")) {
				for (int j = i; j >1; j--) {
					System.out.print(4);
					temp2 = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp2;
				}
				break;
			}
			else {
				System.out.print(1);
			}
		}
		
		
		
		
		
	}

}
