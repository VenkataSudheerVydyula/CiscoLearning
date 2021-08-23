package Collections;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls=new LinkedHashSet();
		ls.add("sudheer");
		ls.add("venky");
		ls.add("ashok");
		ls.add("reddy");
		ls.add("jagan");
		System.out.println(ls.size());
		System.out.println(ls.remove("jagan"));
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		ls.clear();
		System.out.println(ls);
		
		
		
		

	}

}
