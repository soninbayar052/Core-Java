package dayFour.OOP;

public class JavaExample {
	String web;
	String using;
	int visitCounter;

	public JavaExample(String web) {
		
		this.web = web;
	}
	
	public JavaExample(JavaExample je) {
		web=je.web;
		using = je.using;
		visitCounter = je.visitCounter;
	}
	
	void display() {
		System.out.println("website is : "+ web);
	}
	
	public static void main(String[] args) {
		JavaExample obj1 = new JavaExample("JavaLearningExample");
		JavaExample obj2 = new JavaExample(obj1);
		obj1.display();
		obj2.display();
	}
	

}
