package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q_2750{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int count = Integer.parseInt(br.readLine());
        
        int[] arr = new int[count];
        
        for(int i = 0 ; i<count;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
		}
        
    }
    
}


