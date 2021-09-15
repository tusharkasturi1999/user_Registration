package com.bridgelabz.regex.user_Registration;

import java.util.*;
import java.util.regex.*;

/**
 * @author tushar.kasturi_ymedi This is the UserRegistration Class
 */
public class UserRegistration {

	public static final Scanner sc = new Scanner(System.in);
	public final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	public final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}
	
	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}

	
	// This is the main function
	public static void main(String[] args) {
		
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		UserRegistration obj = new UserRegistration();
		if (obj.validateFirstName(fname)) {
			System.out.println("First Name Valid");
		} else {
			System.out.println("First Name Invalid");
		}
		
		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		if (obj.validateFirstName(lname)) {
			System.out.println("Last Name Valid");
		} else {
			System.out.println("Last Name Invalid");
		}
	}
}
