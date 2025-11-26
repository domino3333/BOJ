package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class q_17269 {

	public static int a = 0;
	public static int b = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		String st1 = st.nextToken();
		String st2 = st.nextToken();

		int[] strokeArr = new int[] { 3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

		int longSt = num1 < num2 ? num2 : num1;

		String plus = "";
		// 이름들을 받고 서로 합치기(번갈아가면서)

		// 긴 스트링 기준, 그 길이만큼 돎
		for (int i = 0; i < longSt; i++) {

			if (i < num1) {
				plus += st1.charAt(i);
			}
			if (i < num2) {
				plus += st2.charAt(i);
			}
		}
//		System.out.println(plus);
//		System.out.println();

		// 문자열을 획수의 정수로 바꾼 배열
		int[] intArr = new int[plus.length()];

		for (int i = 0; i < plus.length(); i++) {
			intArr[i] = strokeArr[plus.charAt(i) - 'A'];
		}
//		for (int i = 0; i < plus.length(); i++) {
//			System.out.print(intArr[i]);
//		}

		fff(intArr);
		
		if(a==0) {
			System.out.println(String.valueOf(b)+"%");
		}else {
			System.out.println(String.valueOf(a)+String.valueOf(b)+"%");
		}
		


	}

	public static void fff(int[] arr) {

		int[] tempArr = new int[arr.length - 1];
		
		if (tempArr.length > 2) {
			for (int i = 0; i < tempArr.length; i++) {
				tempArr[i] = (arr[i] + arr[i + 1]) % 10;
			}
//			for (int i = 0; i < tempArr.length; i++) {
//				System.out.print(tempArr[i]);
//			}
//			System.out.println(" ");
			fff(tempArr);
		} else if (tempArr.length == 2) {

			tempArr[0] = (arr[0] + arr[1]) % 10;
			tempArr[1] = (arr[1] + arr[2]) % 10;
			a = tempArr[0];
			b = tempArr[1];
		}
		

	}

}
