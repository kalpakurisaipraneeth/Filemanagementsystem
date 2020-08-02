package filemanagement;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class MainCode {
		public static void main(String[] args) throws Exception
		{
			System.out.println("***************WELCOME TO LOCKME.COM***************");
			System.out.println("***************File Managemen tSystem****************");
			System.out.println("       Developed by : k.sai praneeth kumar            ");
			Scanner scan=new Scanner(System.in);
			Registration reg=new Registration();
			CreateDirectory cd=new CreateDirectory();
			Login log=new Login();
			try {
				
			while(true)
			{
						System.out.println(" 1.Registration \n 2.Login ");
						int choice=scan.nextInt();
						switch(choice)
						{
						case 1:System.out.println("***************WELCOME TO LOCKME.COM***************");
								System.out.println("USER NAME:user name should have 5 letter in lower case and 3 numbers after the letter");
								System.out.println("PASSWORD:Password should be less than 5and more than 9 characters in length.should contain upper case,lower case,number,special character");
							    System.out.print("user name  :");
							    reg.setUsername(scan.next().toLowerCase());
							    System.out.println("password  :");
							    reg.setPassword(scan.next());
							   //System.out.println(reg.getUsername());
							  // System.out.println(reg.getPassword());
							     reg.PasswordValidation();
						         cd.setPath(reg.getUsername());
							     break;
						case 2:System.out.println("Login");
						        log.setPass(reg.getPassword());
						        log.setUser(reg.getUsername());
						        log.login();
						        while(true)
						        {
						        	cd.display();
						        	System.out.println(" 1.Add file \n 2.Search files \n 3.Delete files \n 4.Exit");
						        	int choice1=scan.nextInt();
						        	switch(choice1)
						        	{
						        	case 1:cd.file();
						        			break;
						        	case 2:cd.search();
						        		    break;
						        	case 3:cd.delete();
						        		   break;   
						        	default:System.out.println("enter the valid number");	
						        		 break;
						        	}
						        	System.out.println("enter y to continue , n  to exit" );
							 		char ch=scan.next().charAt(0);
							 		if(ch=='n')
							 		{
							break;
							 		}
				
						        }
						      
						default:System.out.println("Select valid number");
							continue;
						}
						
							
			}
			}
				catch(Exception ex)
				{
				System.out.println(ex.getMessage());
					
		}

	}
		}
	


