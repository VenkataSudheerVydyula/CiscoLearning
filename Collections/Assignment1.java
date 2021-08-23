package Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedHashSet l1=new LinkedHashSet();
		LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
		l1.add(5);
		l1.add(6);
		l1.add(1.36);
		l1.add(1.85);
		l1.add('Z');
		l1.add('F');
		l1.add(true);
		l1.add(false);
		System.out.println(l1);
		System.out.println("enter values");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int m6=sc.nextInt();
        int m7=sc.nextInt();
        int m8=sc.nextInt();
        l2.add(m1);
        l2.add(m2);
        l2.add(m3);
        l2.add(m4);
        l2.add(m5);l2.add(m6);l2.add(m7);l2.add(m8);
        System.out.println(l2);
        
	}

	}


