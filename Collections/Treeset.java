package Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ls=new TreeSet();
		ls.add("india");
		ls.add("england");
		ls.add("newzeland");
		ls.add("afghanisthan");
		ls.add("ireland");
		System.out.println(ls.size());
		System.out.println(ls.remove("jagan"));
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		ls.clear();
		System.out.println(ls);
		

	}

}
