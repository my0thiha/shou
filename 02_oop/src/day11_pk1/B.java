package day11_pk1;

public class B {
	public void test() {
		A obj = new A();
		// System.out.println("i = " + obj.i);//private
		System.out.println("j = " + obj.j);//default ; within the same package
		System.out.println("k = " + obj.k);//protected, within the same package
	}
}
