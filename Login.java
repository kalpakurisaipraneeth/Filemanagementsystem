package filemanagement;
import java.util.Scanner;
public class Login 
{
	private String user;
	private String pass;
   public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
void login()
   {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.next().toLowerCase();
        System.out.print("Enter password:");//password:user
        password = s.next();
        if(username.equals(user) && password.equals(pass))
        {
            System.out.println("login  Successful");
        }
        else
        {
            System.out.println("Register and Login");
        }
    }
}