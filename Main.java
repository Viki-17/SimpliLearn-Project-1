package phase1_project;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void fileAscendingOrder() throws IOException {
		
		File f = new File("E:\\Project Phase 1\\Main");
		
		if(f.isDirectory()){
			List<String> listFile = Arrays.asList(f.list());
			
			Collections.sort(listFile);
			System.out.println("List of files: ");
			for(String s:listFile){
				System.out.println(s);
			}

	}else {
		System.out.println("Not a directory");
	}
		
	}
	
	public static void addFile() {
		
		System.out.print("Enter the name of your file: ");
		
		Scanner sc = new Scanner(System.in);
		
		String fileName = sc.next();
		
		File f = new File("E:\\Project Phase 1\\Main\\"+fileName+".txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println("File created: "+f.getAbsolutePath());
			}else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void deleteFile() {
		
		System.out.print("Enter the name of the file to delete: ");
		
		Scanner sc = new Scanner(System.in);
		
		String fileName = sc.next();
		
		File f = new File("E:\\Project Phase 1\\Main\\"+fileName+".txt");
		
		if(f.delete()) {
			System.out.println("File "+f.getName()+" deletion successful!");
		} else {
			System.out.println("File "+f.getName()+" not found or check the name/case sensitivity of file");
		}
		
		
	}
	
	public static void searchFile() {
		
		System.out.print("Enter the name of the file to search: ");
		
		Scanner sc = new Scanner(System.in);
		
		String fileName = sc.next();
		
		File f = new File("E:\\Project Phase 1\\Main\\"+fileName+".txt");
		
		if(f.exists()) {
			System.out.println("File "+f.getName()+" is available in directory");
		}else {
			System.out.println("File "+f.getName()+" is not availabe in directory");
		}
		
		
	}
	
	
	public static void main(String[]args) throws IOException {
		
		System.out.println("Application name: LockedMe.com\n"+
							"Developed by: Vignesh\n"
							+"Designation: Java Developer\n");
		
		
		while(true) {
		System.out.println("Enter 1: To get the current file names in ascending order");
		System.out.println("Enter 2: To do business operations such as add, delete and search through files");
		System.out.println("Enter 3: To close the application");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		
			if(input==1) {
				fileAscendingOrder();
				continue;
			}
			else if(input == 2) {
				
				System.out.println("Select one options from following to perform business operations");
				System.out.println("Enter 1: To add files to the directory");
				System.out.println("Enter 2: To delete files from the directory");
				System.out.println("Enter 3: To search the files inside the directory");
				System.out.println("Enter 4: To return to back to main content");
				
				int selection = sc.nextInt();
				
				switch(selection) {
				
				case 1: {
					addFile();
				}break;
				
				case 2:{
					deleteFile();
				}break;
				
				case 3:{
					searchFile();
				}break;
				case 4:{
					System.out.println("Back to main content");
				}break;
			}
		}
			else if(input == 3) {
				System.out.println("Exit successful");
				System.exit(input);
			}else  {
				System.out.println("Enter valid input");
				
			}
		
		}
		}

}
