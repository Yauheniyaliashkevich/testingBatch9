package com.class15;

public class InClassTask1 {
	public static void main(String[] args) {
		
		/*
		 * Accept username, password and confirm password from a user and check following requirements:
         * 1) Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".
           2)Password should be minimum 8 characters, if less → message="Password is too short".
           3)Password cannot contain username if so, → message="Password cannot contain username".
           4)Password should match confirmed password, if not  → message="Passwords do not match".
           5)Only after all requirements met → message "Your username and password has been created"
		 * 
		 */
		
		String userName="yauheniya";
		String password="123Edc456";
		String confirmPassword="123Edc456";
		
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}
		
		else if(password.length()<8) {
			System.out.println("Password is too short");
		}
		
		else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}
		
		else if(!password.equals(confirmPassword)) {
			System.out.println("Password do not match");
		}
		
		//if (!userName.isEmpty() && !password.isEmpty() && password.length()>=8 && 
				//!password.contains(userName) && password.equals(confirmPassword)) 
        else {
			System.out.println("Your username and password has been created");
		}
		
	}

}
