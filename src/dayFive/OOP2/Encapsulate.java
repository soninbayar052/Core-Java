package dayFive.OOP2;

public class Encapsulate {
	
	private String name;
	private int rollNumber;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}
}


