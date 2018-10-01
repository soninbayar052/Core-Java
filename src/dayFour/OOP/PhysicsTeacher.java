package dayFour.OOP;

class Teacher {
	
	String designation = "Teacher";
	String nameOfDepartment = "Technical";
	void does() {
		System.out.println("Teach");
	}
	
	public Teacher() {
		System.out.println("From parents class");
	}

}

public class PhysicsTeacher extends Teacher{
	String mainSub= "Physics";
	
	public PhysicsTeacher() {
		super();
	}
	
	public static void main(String[] args) {
		PhysicsTeacher obj1 = new PhysicsTeacher();
		System.out.println(obj1.designation);
		System.out.println(obj1.nameOfDepartment);
		System.out.println(obj1.mainSub);
		obj1.does();
		new PhysicsTeacher();
	}
}