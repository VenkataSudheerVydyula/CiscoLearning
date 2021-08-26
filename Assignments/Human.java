package Assignments;

abstract class Pen{
	abstract void write();
	abstract void refill();
	
}

class FountainPen extends Pen{

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("Write");
		
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("Refill");
		
	}
	
	void changeNib() {
		System.out.println("Change nib");
	}
	
}

class Monkey{
	void jump() {
		System.out.println("jump");
	}
	void bite() {
		System.out.println("bite");
	}
}

interface basicanimal{
	void eat();
	void sleep();
}



	



public class Human extends Monkey implements basicanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Human h=new Human();
      h.eat();
      h.sleep();
      h.jump();
      h.bite();

	}
	@Override
	void jump() {
		System.out.println("human jumps");
	}
	@Override
	void bite() {
		System.out.println("human bite");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
		
	}

}
