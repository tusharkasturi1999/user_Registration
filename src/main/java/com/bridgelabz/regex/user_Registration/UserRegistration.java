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
	public final String EMAIL_PATTERN = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z].*?[a-z]*?$";
	public final String PHONE_PATTERN = "^[0-9]{2}[0-9]{10}$";
	public final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	// This method checks if the entered lawst name is valid
	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}

	// This method checks if the entered email is valid
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matcher(email).matches();
	}

	// This method checks if the entered phone number is valid
	public boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		return pattern.matcher(phone).matches();
	}
	
	// This method checks if the entered password is valid
	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(password).matches();
	}

	//Method for printing validate email output;
	public void emailTest(String email) {
		System.out.print(email+ "->");
		if (validateEmail(email)) {
			System.out.printf("Email Valid \n");
		} else {
			System.out.printf("Email Invalid \n");
		}
	}
	
	// This is the main function
	public static void main(String[] args) {

		UserRegistration obj = new UserRegistration();
		System.out.println("Enter First Name: ");
		String fname = sc.next();
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

		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		if (obj.validateEmail(email)) {
			System.out.println("Email Valid");
		} else {
			System.out.println("Email Invalid");
		}

		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		if (obj.validatePhone(phone)) {
			System.out.println("Phone No. Valid");
		} else {
			System.out.println("Phone No. Invalid");
		}
		
		System.out.println("\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		if (obj.validatePassword(password)) {
			System.out.println("Password Valid");
		} else {
			System.out.println("Password Invalid");
		}
		
		System.out.println("\nSamples Emails to Test");
		obj.emailTest("abc@yahoo.com");
		obj.emailTest("abc-100@yahoo.com");
		obj.emailTest("abc.100@yahoo.com");
		obj.emailTest("abc111@abc.com");
		obj.emailTest("abc-100@abc.net");
		obj.emailTest("abc.100@abc.com.au");
		obj.emailTest("abc@1.com");
		obj.emailTest("abc@gmail.com.com");
		obj.emailTest("abc+100@gmail.com");
	}
}
