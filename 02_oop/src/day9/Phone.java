package day9;

public class Phone {
	//fields
	String brand;
	String color;
	int price;
	static String shop = "ABC";
	
	//constructor
	public Phone(String brand,String color,int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	//methods
	public void call(){
		System.out.println("This is phone calling method");
	}
	
	public void sendSms() {
		System.out.println("This is sending sms method");
	}
	
	public static void main(String[] args) {
		Phone obj;
		obj = new Phone("iPhone" , "Pink", 1800000);
		Phone obj2 = new Phone("Samsung","Black",2500000);
		
		System.out.println("------Obj1's Data------");
		System.out.println("Brand: " + obj.brand);
		System.out.println("Color: " + obj.color);
		System.out.println("Price: " + obj.price);
		System.out.println("Shop:" + shop);
		obj.call();
		obj.sendSms();
		
		Phone.shop = "iSure";
		System.out.println("------Obj2's Data------");
		System.out.println("Brand: " + obj2.brand);
		System.out.println("Color: " + obj2.color);
		System.out.println("Price: " + obj2.price);
		System.out.println("Shop: " + shop);
		obj2.call();
		obj2.sendSms();
	}
}
