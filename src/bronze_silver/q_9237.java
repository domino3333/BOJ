package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q_9237 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] dayOfTrees = new Integer[count];
		for (int i = 0; i < dayOfTrees.length; i++) {
			dayOfTrees[i] = Integer.parseInt(st.nextToken());
		}
		
		//내림차순 해주고 기간이 가장 긴 것부터 심어야함
		Arrays.sort(dayOfTrees,Comparator.reverseOrder());

		
		Integer[] result = new Integer[count];
		for (int i = 0; i < dayOfTrees.length; i++) {
			result[i]=(i+1 + dayOfTrees[i]);
		}
		
		Arrays.sort(result,Comparator.reverseOrder());
		System.out.println(result[0]+1);
		
		
		
	}

}
