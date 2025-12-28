package bronze_silver;

import java.io.*;
import java.util.StringTokenizer;

public class Q_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int s = 0;

        while(count-->0){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("all")){
                s = (1<<21)-1;
            }else if(str.equals("empty")){
                s = 0;
            }else{
                int num = Integer.parseInt(st.nextToken());

                if(str.equals("add")){
                    s |= (1<<num);
                }else if(str.equals("remove")){
                    s = s&~(1<<num);
                }else if(str.equals("check")){
                    if(   (s&(1<<num))!=0    ){
                        bw.write(1+"\n");
                    }else{
                        bw.write(0+"\n");
                    }
                }else if(str.equals("toggle")){
                    s ^= (1<<num);
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();


    }
}
