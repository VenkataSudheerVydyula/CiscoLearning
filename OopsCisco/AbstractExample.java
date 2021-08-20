package OopsCisco;

abstract class Bike
{
	Bike(){
		System.out.println("Bike is Created");
	}
	abstract void run1();
	void changegear()
	{
		System.out.println("gear changed");
	}
	
}

abstract class Honda extends Bike
{
	Honda(){
		System.out.println("Honda is created");
	}
	abstract void run();
	
	abstract void run1();
}

class Hello extends Honda{
	void run() {
		System.out.println("Running safely");
	}
	void run1() {
		System.out.println("Inside the run method");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello();
		h.run();
		h.changegear();
		h.run1();
		

	}

}
