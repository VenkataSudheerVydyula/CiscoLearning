package Ciscopackage2;

import Ciscopackage1.ClassM;
import Ciscopackage1.ClassN;
import Ciscopackage1.ClassP;

public class ClassZ extends ClassM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassM mmm=new ClassM();
		mmm.methodPublic();
		
		ClassN nnn=new ClassN();
		nnn.methodpublic();
		
		ClassP ppp=new ClassP();
		
		ClassX xxx=new ClassX();
		System.out.println(xxx.f3);
		System.out.println(xxx.gender);
		System.out.println(xxx.l3);
		xxx.methodpub();

	}

}
