package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_9037 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int testCount = Integer.parseInt(br.readLine());
		int babyCount = 0;
		

		for (int i = 0; i < testCount; i++) {
			int resultCount = 0;
			babyCount = Integer.parseInt(br.readLine());
			int[] candyArr = new int[babyCount];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < candyArr.length; j++) {
				candyArr[j] = Integer.parseInt(st.nextToken());
			}
			while (true) {
				aaa(babyCount, candyArr);
				if (isSame(candyArr))
					break;
				candyArr = roundCandy(babyCount, candyArr);
				resultCount++;
			}

			System.out.println(resultCount);

		}

	}

	private static boolean isSame(int[] candyArr) {

		for (int i = 0; i < candyArr.length; i++) {
			if (candyArr[0] != candyArr[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] roundCandy(int babyCount, int[] candyArr) {

		int[] resultArr = new int[babyCount];

		for (int i = 0; i < candyArr.length; i++) {
			resultArr[(i + 1) % babyCount] = candyArr[i] / 2 + candyArr[(i + 1) % babyCount] / 2;

		}

		return resultArr;

	}

	private static int[] aaa(int babyCount, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				arr[i]++;
			}
		}
		return arr;
	}

}
