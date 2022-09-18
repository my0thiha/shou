package day11_pk2;
import day11_pk1.A;

public class E extends A{
	
	//protected int k = 20;
	public void test() {
		System.out.println("k = " + k ); // ok 
		//System.out.println("j = " + j); // different pkg 
		
		A obj = new A();
		// System.out.println("A's k = " + obj.k);
		//System.out.println("j = " + obj.j); //different pkg
	}
}
