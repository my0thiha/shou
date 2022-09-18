package day11_pk2;
import day11_pk1.A;

public class D {
	
	public void test() {
		A obj = new A();
		// System.out.println("j = " + obj.j); //different pkg ,hence cant access j.
		//System.out.println("k = " + obj.k); // different pkg, non-subclass
	}
}
