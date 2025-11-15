package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_15953 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		

		
		
		for(int i=0;i<count;i++) {
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score1 = Integer.parseInt(st.nextToken()); // 첫째 등수
			int score2 = Integer.parseInt(st.nextToken()); // 둘째 등수
			
			if(score1<=1) {
				result +=5000000;
			}else if(score1<=3) {
				result +=3000000;
			}else if(score1<=6) {
				result +=2000000;
			}else if(score1<=10) {
				result +=500000;
			}else if(score1<=15) {
				result +=300000;
			}
			else if(score1<=21) {
				result +=100000;
			}
			
			if(score2<=1) {
				result +=5120000;
			}else if(score2<=3) {
				result +=2560000;
			}else if(score2<=7) {
				result +=1280000;
			}else if(score2<=15) {
				result +=640000;
			}else if(score2<=31) {
				result +=320000;
			}
			
			System.out.println(result);
		}
	
	}

}
