package com.mmit_day2;

import java.util.Scanner;

import com.mmit.hello;

public class constantvariable {
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Price: ");
		int price = sc.nextInt();
		
		if (price<MIN_PRICE) {
			price = MIN_PRICE;
		System.out.println("Price: " + price);
		System.out.println("Expense: " + (price*RATE));
		
		hello obj = new hello();
		//obj.display();
		}
	}
}

