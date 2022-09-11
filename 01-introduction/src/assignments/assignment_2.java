package assignments;

import java.util.Scanner;

public class assignment_2 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nWhen do you go to bed?");
			int sleep = sc.nextInt();
			System.out.println("When do you get up?");
			int getup = sc.nextInt();
			if (sleep >= 12) {
				sleep = 24-sleep;
			 int total = sleep+getup;
				if(total >= 5 && total <= 8) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You take care your health well!");
				}
				else if(total < 5) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You are very hardworking!");
				}
				else if(total > 8) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You are abnormal!");
				}
				
			}
			else if (sleep < 12) {
				sleep = sleep;
			 int total = getup-sleep;
				if(total >= 5 && total <= 8) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You take care your health well!");
				}
				else if(total < 5) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You are very hardworking!");
				}
				else if(total > 8) {
					System.out.println(total+" hrs sleep time");
					System.out.println("You are abnormal!");
				}
				
			}
			
		}
	}
	
}
