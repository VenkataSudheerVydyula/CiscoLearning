package Ciscopackage1;

public class ClassP {

	public static void main(String[] args) {
		ClassM m=new ClassM();
		
		m.methodDefault();
		m.methodProtected();
		m.methodPublic();
		
         System.out.println(m.f1);
         System.out.println(m.l1);
         
         
         ClassN n=new ClassN();
         n.methoddefault();
         n.methodprotected();
         n.methodpublic();
         
         System.out.println(n.d2);
         System.out.println(n.i2);
         System.out.println(n.l2);
	}

}
