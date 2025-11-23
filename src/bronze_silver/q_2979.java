package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2979 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int []fair = new int[3];
		
		for(int i =0 ;i <fair.length;i++) {
			fair[i] = Integer.parseInt(st.nextToken());
		}
		
		int []truck = new int[101];
		
		st = new StringTokenizer(br.readLine());
		int a_in = Integer.parseInt(st.nextToken());
		int a_out = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b_in = Integer.parseInt(st.nextToken());
		int b_out = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c_in = Integer.parseInt(st.nextToken());
		int c_out = Integer.parseInt(st.nextToken());
		
		
		for (int i = a_in; i < a_out; i++) {
			truck[i]++;
		}
		for (int i = b_in; i < b_out; i++) {
			truck[i]++;
		}
		for (int i = c_in; i < c_out; i++) {
			truck[i]++;
		}
		
		int sum = 0;
		for (int i = 0; i < truck.length; i++) {
			if(truck[i]==1) {
				sum += fair[0]*1;
			}else if(truck[i] ==2) {
				sum += fair[1]*2;
			}else if(truck[i] == 3){
				sum += fair[2]*3;
			}else {
				continue;
			}
		}
		for (int i = 0; i < truck.length; i++) {
			System.out.println(truck[i]);
		}
		System.out.println();
		System.out.println(sum);

		
	}

}
