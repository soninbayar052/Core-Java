package dayFour.OOP;

public class Person {
	
	int empID;
	int Age;
	String Fname;
	String Lname;
	String Address;
	
	public Person(int empID,int Age, String Fname, String Lname,String Address) {
		this.empID = empID;
		this.Age = Age;
		this.Fname = Fname;
		this.Lname = Lname;
		this.Address  = Address;
	}
	
	public Person (String Fname, int age) {
		this.Fname = Fname;
		this.Age= age;
	}
	
	
	@Override
	public String toString() {
		return "Person [empID=" + empID + ", Age=" + Age + ", Fname=" + Fname + ", Lname=" + Lname + ", Address="
				+ Address + "]";
	}

	public static void main(String[] args) {
		Person emp1= new Person(1558,25,"John","Smith","Columbia pike");
		//Person emp2 = new Person("Milan",15);
	
		System.out.println(emp1);
		
	}

}
