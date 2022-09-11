package assignments;

import java.util.Scanner;

public class assignment_1 {
		public static void main(String[] args) {
			int pos = 0; int neg = 0; int zero = 0;
			for (var i = 0 ; i<5 ; i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Any Number: ");
				int num = sc.nextInt();
				if(num>0) {
					pos++;
				}
				else if(num<0) {
					neg++;
				}
				else if(num==0) {
					zero++;
				}
			}
			System.out.println("The no of positive numbers: " + pos);
			System.out.println("The no of negative numbers: " + neg);
			System.out.println("The no of zero: " + zero);
		}
}
