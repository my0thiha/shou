package oop_assignments;

public class assignment_1demo {
	public static void main(String[] args) {
		assignment_1 user = new assignment_1(1, "Kg Kg", 123456, "Gk Gk");
		//System.out.println(user);
		user.showinfo();
		user.withdraw();
		user.deposit();
		user.changePassword();
		user.showinfo();
	}
}
