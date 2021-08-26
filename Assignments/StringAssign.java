package Assignments;

import java.util.*;

public class StringAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String st=sc.nextLine();
		
		String str="";
		
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		str=new String(ch);
		
		if(str.equalsIgnoreCase(st))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
