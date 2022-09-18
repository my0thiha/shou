package oop_assignments;

import java.util.Scanner;

public class assignment_1 {
	
	int accountNo;
	String holderName;
	int pinNo;
	String password;
	int balance = 1000000;
	
	public assignment_1(int accountNo, String holderName, int pinNo, String password) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
	}
	
	public void withdraw() {
		Scanner sc= new Scanner(System.in);
		System.out.println("How much do you want to withdraw?");
		int withdraw = sc.nextInt();
		if(balance >= withdraw) {
			balance = balance - withdraw;
			System.out.println("The process is completed!" + "\nYour balance is now " + balance);
			System.out.println("------------------------");
		}
		else {
			System.out.println("Your balance is less than " + withdraw);
			System.out.println("Please Try Again!");
			System.out.println("------------------------");
		}
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much do you want to deposit?");
		int deposit = sc.nextInt();
		balance = balance + deposit;
		System.out.println("The process is completed!");
		System.out.println("Your balance is now " + balance);
		System.out.println("------------------------");
	}
	
	
	
	@Override
	public String toString() {
		return "assignment_1 [accountNo=" + accountNo + ", holderName=" + holderName + ", pinNo=" + pinNo
				+ ", password=" + password + "]";
	}

	public void changePassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin number: ");
		int input = sc.nextInt();
		if(input == (this.pinNo)) {
			System.out.println("Enter New password: ");
			Scanner scanner = new Scanner(System.in);
			String newPass = scanner.nextLine();
			password = newPass;
			System.out.println("Your password is updated!");
			System.out.println("------------------------");
		}
		else if  (input != (this.pinNo)) {
			System.out.println("Invalid Pin number!");
			System.out.println("------------------------");
		}
	}
	public void showinfo() {
		System.out.println("Account number: " + accountNo );
		System.out.println("Name of holder : " + holderName );
		System.out.println("Pin number: " + pinNo );
		System.out.println("Password: " + password );
		System.out.println("Balance : " + balance);
		System.out.println("------------------------");
	}
	
}
