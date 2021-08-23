package Collections;

import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add("C sharp");
		t.add("Core java");
		t.add("python");
		t.add("react");
		t.add("sql");
		t.add("Java Script");
		System.out.println(t);
		t.remove("python");
		t.remove("sql");
		System.out.println(t);
		t.add("Node js");
		t.add("Programming");
		t.add("servelets");
		System.out.println(t);
		System.out.println(t.contains("java"));
		
		t.clear();
		System.out.println(t);
		

	}

}
