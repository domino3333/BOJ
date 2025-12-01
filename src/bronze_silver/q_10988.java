package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_10988 {

	public static void main(String[] args) throws IOException{

		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isPelin = true;
		String st = br.readLine();
		
		char[] temp = new char[st.length()];
		
		int p = 0; //5 -1 =4
		for (int i = st.length()-1; i >=0; i--) {
			temp[p++] = st.charAt(i); // 뒤집은 문자열
		}
		System.out.println(temp);
		
		char[] stToChar = st.toCharArray();
		
		for (int i = 0; i < stToChar.length; i++) {
			if(temp[i]!=stToChar[i]) {
				isPelin = false;
			}
		}
		if(isPelin) System.out.println(1);
		else System.out.println(0);
		
		
		
	}

}
