package secondWeek;

public class Car {

	public static void main(String[] args) {
		Car obj1 = new Car();
		try {
			obj1.CarWheelandDoor(3, 3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	void CarWheelandDoor(int wheel, int door) throws CarExceptions {
		if (wheel < 4 && door < 4) {
			throw new CarExceptions("Car is less than 4 door or Wheel");
		}
	}
}

class CarExceptions extends Exception {
	public CarExceptions(String s) {
		super(s);
	}
}
