package dayFour.OOP;

public class Employee {
	
	String empName;
	int empSalary;
	String address;
	
	public Employee() {
		this("John Smith");
	}
	public Employee(String name) {
		this(name, 12000);
	}
	public Employee(String name, int sal) {
		this(name,sal,"120 main st");
	}
	public Employee(String name, int sal, String Address) {
		this.empName = name;
		this.empSalary=sal;
		this.address = Address;
	}

	void display() {
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.display();
	}
}
