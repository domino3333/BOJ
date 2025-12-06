package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String st = br.readLine();
		int[] originArr = new int[st.length()];
		
		for (int i = 0; i < st.length(); i++) {
			originArr[i] = st.charAt(i)-'0';
		}
		
		int[] counting = new int[10];//각 자리의 숫자는 0~9만 가능하므로 10칸
		//1.카운트 구하기
		
		for (int i = 0; i < originArr.length; i++) {
			counting[originArr[i]]++;
		}
		
		//2.누적합
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		int[] result = new int[st.length()];
		//누적합을 주소로 숫자넣기 result = origin
		for (int i = originArr.length-1; i >=0; i--) {
			
			int value = originArr[i];
			counting[value]--;
			int pos = counting[value];
			result[result.length - 1 - pos] = value;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
	

}
