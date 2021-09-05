package FirstProject;

import java.io.IOException;
import java.util.Scanner;



public class ClientView  {
	static String Appname="Virtual key for your Repositories";
	static String DeveloperName="VENKATA SUDHEER VYDYULA";
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO THE"+ "  "+Appname);
		System.out.println("Developer Name :"+DeveloperName);
		
		boolean run=true;
		Scanner sc=new Scanner(System.in);
		
		//OBJECT OF THE FILE HANDLE
		
		MethodDef md=new MethodDef();
		
		char ch=0;
		do {
			System.out.println("MAIN MENU");
			System.out.println("1.Show Files");
			System.out.println("2.Show files menu");
			System.out.println("3.Exit");
			System.out.println("Enter the Option that what do you want?");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				//OPEN THE FILE
				System.out.println("Open the file");
				md.OpenFile(null);
				break;
				
			case 2:
				Filemenu();
								break;
				
			
				
			case 3:
				//Exit from the Folder
				System.out.println("Exits Succesfully");
				run=false;
				sc.close();
				System.exit(0);  //USING EXIT METHOD
				
				default:
					System.out.println("Please enter valid Number");
					break;
					
			}
			md.Endisplay();
			System.out.println("Do you want continue(Type y or n) \n");
			ch=sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
		{
			if(run == true);
		}

	}
	
	public static void Filemenu() {
		
		System.out.println("1.AddFile");
		System.out.println("2.DeleteFile");
		System.out.println("3.SearchFile");
		System.out.println("4.Return to main menu ");
		System.out.println("Enter the Option that what you are Searching..!");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		MethodDef md=new MethodDef();
		
		switch(choice)
		{
		
		
		case 1:
		//ADDING THE FILE
		
		
		System.out.println("Enter the filename");
		try {
			String FileAdd=sc.next();
			md.AddFile(FileAdd,sc);
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		break;
		
		
	case 2:
		//DELETING THE FILE

		
		System.out.println("Enter the file name to Delete ");
		try {
		String FileDelete=sc.next();
		md.DeleteFile(FileDelete,sc);

		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		break;
		
	case 3:
		//SEARCH THE FILE
		System.out.println("Enter the name of the file to Search");
		try {
			String fileName=sc.next();
			md.Search(fileName,"C:\\Users\\hp\\Desktop\\CiscoProject\\");
			
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 4:
		return;

		
	}

}

}
class InvalidFileException extends Exception
{
	public InvalidFileException(String s)
	{
		super(s);
	}

}


