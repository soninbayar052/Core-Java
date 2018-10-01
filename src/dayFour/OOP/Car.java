package dayFour.OOP;

public class Car {

	int Wheels;
	String Color;
	String Model;
	int Door;
	String EngineType;

	public Car(int wheels, String color, String model, int door, String engineType) {
		this.Wheels = wheels;
		this.Color = color;
		this.Model = model;
		this.Door = door;
		this.EngineType = engineType;
	}

	public static void main(String[] args) {

		Car car1 = new Car(4, "White", "Toyota PRius", 4, "V4 Hybrid");
		//Car car2 = new Car(6, "Black", "Ford F150", 2, "V8");
		//Car car3 = new Car(4, "White", "Toyota Camry", 4, "V6");
		System.out.println(car1);
	}

	@Override
	public String toString() {
		return "Car [Wheels=" + Wheels + ", Color=" + Color + ", Model=" + Model + ", Door=" + Door + ", EngineType="
				+ EngineType + "]";
	}
}
