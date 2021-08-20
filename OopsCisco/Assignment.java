package OopsCisco;

//PARENT CLASS
class Vehicle{
	int speed=4;
	long distance=5;
	Vehicle(){
		System.out.println(speed);
		System.out.println(distance);
	}
	void run() {
		System.out.println("Run the vehicle");
	}
	void stop() {
		System.out.println("Stop the vehicle");
	}
	void fuel(int m)
	{
		System.out.println("integer fuel");
	}
	void fuel(float x,String z)
	{
		System.out.println("String fuel");
	}
	
	void fuel(char a,int b)
	{
		System.out.println("Character fuel");
	}
}

//TWO WHEELER
class TwoWheeler extends Vehicle{
	int speed=6;
	long distance=7;
	int nos_of_tyre=2;
	
	public TwoWheeler() {
		super();
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
	}
	
	@Override
	void run() {
		System.out.println("Run the vehicle1");
	}
	@Override
	void stop() {
		System.out.println("stop the vehicle1");
	}
	
	void display(){
		
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		two.display();

	}
	
}

//THREE WHEELER
class ThreeWheeler extends Vehicle{
	int speed=8;
	long distance=9;
	int nos_of_tyre=3;
	
	public ThreeWheeler() {
		super();
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	
	@Override
	void run() {
		System.out.println("Run the vehicle2");
	}
	@Override
	void stop() {
		System.out.println("stop the vehicle2");
	}
	
	void display(){
		
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	public static void main(String[] args) {
		ThreeWheeler three=new ThreeWheeler();
		three.display();

	}
	
}

//FOUR WHEELER

class FourWheeler extends Vehicle{
	int speed=11;
	long distance=12;
	int nos_of_tyre=4;
	
	public FourWheeler() {
		super();
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	
	@Override
	void run() {
		System.out.println("Run the vehicle3");
	}
	@Override
	void stop() {
		System.out.println("stop the vehicle3");
	}
	
	void display(){
		
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	public static void main(String[] args) {
		FourWheeler four=new FourWheeler();
		four.display();

	}
	
}

//8 WHEELER
class EightWheeler extends Vehicle{
	int speed=6;
	long distance=7;
	int nos_of_tyre=8;
	
	public EightWheeler() {
		super();
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	
	@Override
	void run() {
		System.out.println("Run the vehicle4");
	}
	@Override
	void stop() {
		System.out.println("stop the vehicle4");
	}
	
	void display(){
		
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(nos_of_tyre);
		
	}
	public static void main(String[] args) {
		EightWheeler eight=new EightWheeler();
		eight.display();

	}
	
}

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle h1=new Vehicle();
		h1.run();
		h1.stop();
		
		Vehicle h2=new TwoWheeler();
		h2.run();
		h2.stop();
		
		Vehicle h3=new ThreeWheeler();
		h3.run();
		h3.stop();
		
		Vehicle h4=new FourWheeler();
		h4.run();
		h4.stop();
		
		Vehicle h5=new EightWheeler();
		h5.run();
		h5.stop();

	}

}
