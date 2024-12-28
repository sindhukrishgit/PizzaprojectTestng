package testfiles;
import java.io.File;

public class folderactions {
	//create new folder
	public static void createFolder(String folderpath)
	{  
		File folder = new File(folderpath);
		folder.mkdir();
		System.out.println("folder created:"+folderpath);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("folder created:"+folderpath);
		
		}
	}	
	public static boolean checkFolderexists(String folderpath)
	 {  
		File folder = new File(folderpath);
		return folder.exists();	
		
	 }	
	public static String Folder_rename(String oldfolderpath,String newfolderpath)
	 {  
		File oldfolder = new File(oldfolderpath);
		File newfolder = new File(newfolderpath);
		
		
		if(oldfolder.exists())
		 {	
		   oldfolder.renameTo(newfolder);
		   System.out.println("folder renamed is :"+newfolderpath);
		   
		 }	  
		return newfolderpath;
	 }
	public static void main(String args[]) {	
		String   folderpath = "C:\\Myfiles";
		createFolder(folderpath);
		boolean val = checkFolderexists(folderpath);
		System.out.println("folder created:"+val);
		String newpath = "C:\\Myfileskrish";
		String Renamedfile = Folder_rename(folderpath,newpath);
		System.out.println("folder renamed is :"+Renamedfile);
			
	}
  }
