package AssignmentOOPS;

public class ConstructorParam {
	String name;
	int age;
	char section;
	char gender;
	int subject1,subject2,subject3;
	int total;
	float percentage;
	
	public ConstructorParam(String s,int a,char c,char g,int sub1,int sub2,int sub3) {
		// TODO Auto-generated constructor stub
		name=s;
		age=a;
		section=c;
		gender=g;
		subject1=sub1;
		subject2=sub2;
		subject3=sub3;
		total=(subject1+subject2+subject3);
		percentage=(total/300f)*100f;
		
		
		
	}

	void display() {
		System.out.println("Name:"+" "+name+" "+"Age"+" "+age+"Gender"+" "+gender+"Total marks"+" "+total+"Percentage"+" "+percentage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParam s1=new ConstructorParam("Sudheer",23,'S','M',75,75,75);
		ConstructorParam s2=new ConstructorParam("Suresh",20,'P','M',74,74,74);
		ConstructorParam s3=new ConstructorParam("Surya",21,'Q','M',73,73,73);
		ConstructorParam s4=new ConstructorParam("Macha",22,'R','M',72,72,72);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		

	}

}
