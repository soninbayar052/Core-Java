package dayFive.OOP2;

public class Student {
	
	int rollNunm;
	String StudentName;
	Address stuAddress;
	public Student(int rollNunm, String studentName, Address stuAddress) {
		super();
		this.rollNunm = rollNunm;
		StudentName = studentName;
		this.stuAddress = stuAddress;
	}
	
	
	public static void main(String[] args) {
		Address ad = new Address("120","Falls Church", "VA","USA");
		Student stu= new Student(123,"mike",ad);
		
		System.out.println(stu.StudentName);
		System.out.println(stu.stuAddress.city); // Aggregation
		System.out.println(stu.stuAddress.country);
	}
	
	
  
	

}
