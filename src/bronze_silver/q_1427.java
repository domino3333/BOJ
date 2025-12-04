package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class q_1427 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		
		int count = st.length();
		char[] arr = new char[count];
		for (int i = 0; i < count; i++) {
			arr[i] = st.charAt(i);
		}
		
		String[] ss = new String[count];
		for (int i = 0; i < arr.length; i++) {
			ss[i] = String.valueOf(arr[i]);
		}
		int[] intArr = new int[count];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(ss[i]);
		}
		
		Arrays.sort(intArr);
		
		for (int i = intArr.length-1; i >= 0; i--) {
			System.out.print(intArr[i]);
		}
		
		
		
		
		

	}

}
