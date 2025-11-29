package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1110 {

	public static int count=0;
	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String a =null;
		if(n<10) {
			a = "0"+String.valueOf(n);
		}else if(n>=10) {
			a = String.valueOf(n);
		}
		fff(a,n);

		
	}
	
	public static void fff(String num,int n) {
		
		int oneJari = Integer.parseInt(num) % 10 ;
		int tenJari = Integer.parseInt(num) / 10 ;
		
		int plusJari = oneJari+tenJari; // 각 자리 숫자 더하기
		
		//주어진 수의 가장 오른쪽 자리 수 26이면 6 oneJari
		String newNum = String.valueOf(oneJari) + String.valueOf(plusJari%10);
		//System.out.println(newNum);
		count++;
		
		if(Integer.parseInt(newNum) == n) {
			System.out.println(count);
			return;
		}
		
		
		fff(newNum,n);

	}

}
