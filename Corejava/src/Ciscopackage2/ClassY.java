package Ciscopackage2;

import Ciscopackage1.ClassN;
import Ciscopackage1.ClassM;

public class ClassY extends ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassN nn=new ClassN();
		nn.methodpublic();
		
		ClassM mm=new ClassM();
		mm.methodPublic();
		
		ClassX xx=new ClassX();
		System.out.println(xx.f3);
		System.out.println(xx.gender);
		System.out.println(xx.l3);
		xx.methodpub();
		

	}

}
