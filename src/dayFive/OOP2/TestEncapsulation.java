package dayFive.OOP2;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		Encapsulate encap = new Encapsulate();
		encap.setAge(15);
		encap.setName("Soninbayar");
		encap.setRollNumber(55);
		
		
		System.out.println(encap);
		System.out.println(encap.getAge() + encap.getName() +encap.getRollNumber());
	}
	
	
	
}
