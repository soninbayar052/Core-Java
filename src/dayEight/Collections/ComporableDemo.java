package dayEight.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class ComporableDemo {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(1,"Jack" ,"Smith", "120 main st"));
		list.add(new Person(2,"John" ,"Smith", "120 main st"));
		list.add(new Person(3,"Love" ,"Smith", "120 main st"));
		list.add(new Person(4,"Gosh" ,"Smith", "120 main st"));
		
		System.out.println(list);
		
		HashMap<Integer, Person> map = new HashMap<>();
		map.put(1, list.get(0));
		map.put(2, list.get(1));
		map.put(3, list.get(2));
		
		System.out.println(map);
		
	}
}

class Person{
	int id;
	String fName, lName, Address;
	public Person(int id, String fName, String lName, String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + ", lName=" + lName + ", Address=" + Address + "]";
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
