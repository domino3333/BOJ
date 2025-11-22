package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2920_resolved {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean isAscending = false;
		boolean isDescending = false;
		
		int[]arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]+1==arr[i+1]) {
				isAscending = true;
			}
			else {
				isAscending = false;
				break;
			}
		}
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]-1==arr[i+1]) {
				isDescending = true;
			}
			else {
				isDescending = false;
				break;
			}
		}
		
		if(isAscending) System.out.println("ascending");
		if(isDescending) System.out.println("descending");

		
		if(!isAscending && !isDescending) {
			System.out.println("mixed");
		}
		
		
		
	}


	
}
