package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q_2309 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		boolean tf = true;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 아홉개중 두개를 뽑자
		// 합 - 두개합 == 100 이 되면 두개가 범인 그 둘을 빼고 출력하면 됨
		// 조합으로 두개를 뽑고 두개 합이 100이 되는 걸 찾기
		
		Arrays.sort(arr);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - (arr[i] + arr[j]) == 100) {
					a = i;
					b = j;
					tf = false;
					break;
				}

			}
			if(!tf) break;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == a || i == b) {
				continue;
			}
			System.out.println(arr[i]);
		}

	}

}
