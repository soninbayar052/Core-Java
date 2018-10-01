package dayEight.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
	public static void main(String[] args) {
		ArrayList<vehicle> car = new ArrayList<>();
		car.add(new vehicle(1, "X", "black", 2));
		car.add(new vehicle(2, "X", "Red", 2));
		car.add(new vehicle(3, "Y", "black", 4));
		car.add(new vehicle(4, "Y", "Red", 4));
		car.add(new vehicle(5, "3", "Black", 4));

		Collections.sort(car);
		for (vehicle veh : car) {
			System.out.println(veh.model + " : " + veh.color + " : " + veh.door);
		}
	}

}

class vehicle implements Comparable<vehicle> {
	int id;
	String model, color;
	int door;

	public vehicle(int id, String model, String color, int door) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.door = door;
	}

	@Override
	public String toString() {
		return "vehicle [id=" + id + ", model=" + model + ", color=" + color + ", door=" + door + "]";
	}

	@Override
	public int compareTo(vehicle o) {
		// TODO Auto-generated method stub
		int model = this.model.toLowerCase().compareTo(o.model.toLowerCase());
		return model == 0 ? this.color.toLowerCase().compareTo(o.color.toLowerCase()) : model;
	}

}