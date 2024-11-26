package bnkproject;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String user_name,String pass_word)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String passWord=rb.getString("password");
		
		if(user_name.equals(userName) && pass_word.equals(passWord))
		
		return 1;
		else
		return 0;
		
	}
 	

	
	
}
