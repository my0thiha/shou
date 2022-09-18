package day9;

public class Employee {

	static int noOfEmployee = 3;
	static int nextId= 1;
	final int empId;
	String name;
	int salary;
	
	public Employee() throws AppException {
		if (nextId>noOfEmployee) 
			throw new AppException("Sorry! Limited Number has been reached");
		empId = nextId;
		nextId++;
	}
	
	public void initData(String name,int salary) {
		this.name= name;
		this.salary= salary;
	}
	
	public void changeData(String newName,int newSalary) {
		if(!newName.equals(this.name))
			this.name = newName;
		if(newSalary != (this.salary))
			this.salary = newSalary;	
	}
	
	public void showData() {
		System.out.println(this.empId + "\t" + this.name + "\t" + this.salary);
	}
	
	@Override
	public String toString() {
		return "Name = " +name + "\tSalary=" + salary;
	}
	
	public static void main(String[] args) {
		try {
			Employee emp1 = new Employee();
			emp1.initData("Kyaw Kyaw",200000);
			Employee emp2 = new Employee();
			emp2.initData("Naung Naung",150000);
			Employee emp3 = new Employee();
			emp3.initData("Nilar\t",600000);
			
			System.out.println("ID\t Name \t Salary");
			System.out.println("----------------------------");
			emp1.showData();
			emp2.showData();
			emp3.showData();
			
			emp1.changeData("Kyaw Kyaw",1000000);
			System.out.println("After change, " + emp1);
			Employee emp4= new Employee();
	
		} 
		catch (AppException e) {
			System.err.println(e.getMessage());
		}
	}
}

