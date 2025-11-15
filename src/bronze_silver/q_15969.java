package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_15969 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] student = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count; i++) {

			student[i] = Integer.parseInt(st.nextToken());
		}

		int maxScore = student[0];


		for (int i = 0; i < count; i++) {
			if (student[i] > maxScore) {
				maxScore = student[i];

			}
		}

		int minScore = student[0];
		for (int i = 0; i < count - 1; i++) {
				if(student[i]<minScore) {
					minScore = student[i];
				}
				

			System.out.printf("%d\n",minScore);

		}

		System.out.printf("%d,%d\n", maxScore, minScore);

		System.out.println(maxScore - minScore);

	}

}
