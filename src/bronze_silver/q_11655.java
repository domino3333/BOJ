package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class q_11655 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        for(int i = 0; i<s.length(); i++){
        char c = s.charAt(i);
            
           if(c>='A'&& c<='Z'){
              c+=13;
              if(c>'Z'){
                c-=26;
              }
           }
         else if(c>='a'&& c<='z'){
              c+=13;
              if(c>'z'){
                 c-=26;
              }
           }
            
        System.out.print(c);
        }
    }
}
