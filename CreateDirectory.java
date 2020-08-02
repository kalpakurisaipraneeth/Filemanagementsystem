package filemanagement;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 
class CreateDirectory {
private static final String Null = null;
public String path;
public String sai;

      public String getPath() {
	return path;
      }
      public void setPath(String path) {
    	  this.path = path;
      File file = new File("C:\\LOCKME\\"+path);
      boolean bool = file.mkdir();
      if(bool){
         System.out.println("Directory created successfully");
         //System.out.println(file.getAbsolutePath());
         //System.out.println(file.getName());
         
      }else{
         System.out.println("Sorry couldn’t create specified directory");  
      } 
      }
      void file() 
      {
    	  System.out.println("Enter the File to add");
    	  Scanner scan=new Scanner(System.in);
  	String name = scan.next().toLowerCase();      // user entered file name;
	String file_name = name+".txt";               // {name} to {name}.txt
	File fileobj = new File("C:\\LOCKME\\"+path+"/"+file_name);
	boolean status = false;
	if (fileobj.exists())
		System.out.println("File exists");
	else {
		try {
			status = fileobj.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((status == true) ? "File Created.." : "File Not Created..");
	}
		
}
      void display()
      {
    		        String[] pathnames;
    		        File f = new File("C:\\LOCKME\\"+path);
    		        pathnames = f.list();
    		        for (String pathname : pathnames) {
    		            System.out.println(pathname);
    		        }
    		    }

      void search() throws IOException
      {
    	  
    			Scanner scan = new Scanner(System.in);
    			String out = Null;
    			System.out.println("Enter the file to be searched : ");
    			String search = scan.nextLine();		
    			
    			File obj1 = new File("C:\\LOCKME\\"+path);
    			String[] list = obj1.list();
    			for (String i : list) {			
    				if(i.equals(search))
    				{
    					out=i;
    				}			
    			}
    			
    			if(out!=Null)
    				System.out.println("The Requested File is Found : " + out);
    			else
    				System.out.println("The Requested File is not Found ");
    			
      }
 
    	  
  
      void delete()
      {
    			 Scanner scan = new Scanner(System.in);
    				System.out.println("Enter the name of the file you want to delete.");
    				String del = scan.nextLine();
    			File obj = new File("C:\\LOCKME\\"+path,del);
    			if(obj.delete())
    			{
    				System.out.println("the file is deleted successfully.");
    			}
    			else
    				System.out.println("the file is not found to delete.");
    			
    		}
      }

