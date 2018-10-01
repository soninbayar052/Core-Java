package daySix.OOP3;
/*
 * Plain Old Java Object, and would be used to describe the same things as a 
 * "Normal Class" whereas a JavaBean follows a set of rules. Most commonly Beans 
 * use getters and setters to protect their member variables, which are typically
 *  set to private and have a no-argument constructor.
 */
public class JavaPojo {
	
	private int sum;
	private String name;
	private String address;
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "JavaPojo [sum=" + sum + ", name=" + name + ", address=" + address + "]";
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public JavaPojo(int sum, String name, String address) {
		super();
		this.sum = sum;
		this.name = name;
		this.address = address;
	}
	
	
}
