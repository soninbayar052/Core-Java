package dayOne.DataTypeandOperators;

public class EnumTest {
	
	public static void main(String[] args) {
		Color col1 = Color.GREEN;
		System.out.println(col1);
		
		
		for(Weekdays D: Weekdays.values()) {
			System.out.println(D);
		}
		
	}
	
	enum Color{
		RED,GREEN,BLUE;
	}
	
	
	enum Weekdays{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}

}
