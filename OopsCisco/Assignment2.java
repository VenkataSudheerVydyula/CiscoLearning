package OopsCisco;

//PARENT
abstract class MNC
{
	MNC(){
		
	}
	abstract void method1();
	abstract void method2();
	void MNC() {
		System.out.println("MNC method");
	}
	
}

//CHILD 1
abstract class INFOSIS extends MNC{
	 void method1() {
		System.out.println("method-1");
	}
	 
	 abstract void method2();
}

//CHILD 2
class Helloo extends INFOSIS{
		void method2() {
		System.out.println("method-2");
	}
	void method3() {
		System.out.println("method-3");
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MNC s=new Helloo();
		s.method1();
		s.MNC();
		
		Helloo c=new Helloo();
		
		c.method2();
		c.method3();
		

	}

}
