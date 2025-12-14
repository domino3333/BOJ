package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		
		int[] countingArr = new int[10001];
		int[] originArr = new int[count];
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			originArr[i]= num;

		}
		
		// 각 숫자의 개수를 담는 count어레이
		for (int i = 0; i < count; i++) {
			countingArr[originArr[i]]++;
		}
		//누적합
		for (int i = 1; i < countingArr.length; i++) {
			countingArr[i] +=countingArr[i-1];
		}
		//누적합-1이 숫자의 주소
		
		int[] resultArr = new int[count];
		for (int i = count-1; i>= 0; i--) {
			int value = originArr[i];
			countingArr[value]--;
			int position = countingArr[value];
			resultArr[position] = value;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : resultArr) {
			sb.append(a).append("\n");
		}
		System.out.println(sb);
		
	}

}
