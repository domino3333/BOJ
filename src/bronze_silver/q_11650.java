package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class q_11650 {

	public static void main(String[] args) throws IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		
		List<ItemXY> xyList = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			xyList.add(new ItemXY(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		
		xyList.sort(Comparator.comparingInt(ItemXY::getX).thenComparingInt(ItemXY::getY));
		
		for (ItemXY itemXY : xyList) {
			System.out.println(itemXY.toString());
		}
		
	}

}

class ItemXY{
	
	int x;
	int y;
	
	
	@Override
	public String toString() {
		
		return this.x+" "+this.y;
	}
	
	public ItemXY(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	
	
}
