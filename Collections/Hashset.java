package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> ls=new HashSet();
		ls.add("Banana");
		ls.add("Apple");
		ls.add("Mango");
		ls.add("PineApple");
		ls.add("Orange");
		System.out.println(ls.size());
		System.out.println(ls.remove("jagan"));
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		ls.clear();
		System.out.println(ls);
		
		// TODO Auto-generated method stub

	}

}
