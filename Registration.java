package filemanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Registration
{ 

  private String username;
   private String password;
   
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public void PasswordValidation()
{
        boolean valid = true;
        if (password.length() > 9 || password.length() < 5)
        {
                System.out.println("Password should be less than 9 and more than 5 characters in length.");
                valid = false;
        }
        if (password.indexOf(username) > -1)
        {
                System.out.println("Password Should not be same as user name");
                valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
                System.out.println("Password should contain atleast one upper case alphabet");
                valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
                System.out.println("Password should contain atleast one lower case alphabet");
                valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
                System.out.println("Password should contain atleast one number.");
                valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars ))
        {
                System.out.println("Password should contain atleast one special character");
                valid = false;
        }
        if (valid)
        {
                System.out.println("Password is valid.");
        }
}



}

