package bronze_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class q_10814 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Item> itemList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			int num =Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			itemList.add(new Item(num,name));
		}
		
		itemList.sort(Comparator.comparingInt(Item::getNumber));
		for(Item item : itemList) {
			System.out.println(item.getNumber()+" "+item.getName());
		}
		
	}

}

class Item{
	private int number;
	private String name;
	
	public Item() {
		this(0,"");
	}
	public Item(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}


