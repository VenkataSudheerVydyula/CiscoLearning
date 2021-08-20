package OopsCisco;

class Employee
{
	float salary=4000;
	int bonus=2000;
	public void show()
	{
		System.out.println("Inside the parent class");
	}
	
	public void display()
	{
		System.out.println("we are inside the display");
	}
}

public class Multilevelsuper extends Employee {

	int bonus=1000;
	
	public void show()
	{
		System.out.println("Bonus of Employee is:"+super.bonus);
		System.out.println("inside the child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelsuper m=new Multilevelsuper();
		System.out.println("programmer salary is:"+m.salary);
		System.out.println("Bonus of Programmer is:"+m.bonus);
		m.show();
		m.display();

	}

}
