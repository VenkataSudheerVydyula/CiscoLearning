package OopsCisco;

 abstract class Abstraction {

private int age=5;
	
	public void method() {
		System.out.println("Age is:"+age);
	}
	
	abstract void abstractmethod();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


public class Basic extends Abstraction
{
	
}