package FirstProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class MethodDef {
	
	
	//SEARCHING THE FILE 
		public static void SearchFile(String path, String fileName, List<String> fileListNames) 
		{
			File dir = new File("C:\\Users\\hp\\Desktop\\CiscoProject\\");
			File[] files = dir.listFiles();
			List<File> filesList = Arrays.asList(files);

			if (files != null && files.length > 0)
			{
				for (File file : filesList) 
				{

					if (file.getName().startsWith(fileName)) 
					{
						fileListNames.add(file.getAbsolutePath());
						
					}

					// Need to search in directories separately to ensure all files of required
					// fileName are searched
					if (file.isDirectory()) 
					{
						SearchFile(file.getAbsolutePath(), fileName, fileListNames);
						
					}
					
				}
				
			}
		}

		
		
			

	//ADDING THE FILE 
		public static void AddFile(String fileToAdd,Scanner sc) throws InvalidFileException
		{
			Path pathToFile = Paths.get("C:\\Users\\hp\\Desktop\\CiscoProject\\" +fileToAdd);
			
			try
			{
				
				Files.createDirectories(pathToFile.getParent());
				Files.createFile(pathToFile); 
				
					System.out.println(fileToAdd + " created successfully");
				
				
			} 
			catch (IOException  e) 
			{
				
				System.err.println("File Already present \n"+e.getMessage());
			}
			
		}



		
		
		//SEARCHING THE FILE
		public static List<String> Search(String fileName, String path)
		{
			List<String> fileListNames = new ArrayList<>();
			MethodDef.SearchFile(path, fileName, fileListNames);

			if (fileListNames.isEmpty())
			{
				
				System.out.println("\n Unsuccessful Operation \n------File Not find with the given file name \"" + fileName + "\" ------\n\n");  //file not found 
			} 
			else 
			{
				System.out.println("\n Successful Operation \nFound file at below location(s):");

				List<String> files = IntStream.range(0, fileListNames.size())
						.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

				files.forEach(System.out::println);
			}

			return fileListNames;
		}
		
		//OPENING THE FOLDER IN ASCENDING ORDER
				public static void OpenFile(String sname)
				{
					try
					{
						// Path of the folder
						File fdir = new File("C:\\Users\\hp\\Desktop\\CiscoProject\\"); //path 
						if(fdir.isDirectory())
						{
							List listFile = Arrays.asList(fdir.list());
							
							
							Collections.sort(listFile);   //sort
							System.out.println("File Name Sorted In Ascending Order");
							for(Object name : listFile)
							{
								System.out.println(name);
							}
						}
						else
						{
							System.out.println(fdir.getName() +" No Such File Found!----");
						}
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					
					
				}


		// DELETE THE FILE
				public static void DeleteFile(String fileToDelete,Scanner sc) throws InvalidFileException
				{

				File f= new File("C:\\Users\\hp\\Desktop\\CiscoProject\\"+fileToDelete); //file to be delete

				if(f.delete())
				{ 
				System.out.println(f.getName() + " Sucessfully Deleted"); //getting and printing the file name
				} 
				else
				{ 
					throw new InvalidFileException("File Not Found");
				} 

				}





		public void Endisplay() {
			// TODO Auto-generated method stub
			
		}
		

	

}
