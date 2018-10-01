package dayFour.OOP;

public class EncapsulationDemo {
	private int ssn=10;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	

}

class demo extends EncapsulationDemo{
	public static void main(String[] args) {
		demo d = new demo();
		d.setSsn(12);
		System.out.println(d.getSsn());
	}
}
