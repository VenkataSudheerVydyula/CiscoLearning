package OopsCisco;

class Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking....");
	}
}

class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping..........");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.bark();
		b.eat();
		b.weep();
		// TODO Auto-generated method stub

	}

}
