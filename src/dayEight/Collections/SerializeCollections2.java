package dayEight.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializeCollections2 {

	public static void main(String[] args) throws IOException {
		// ReadFromEmployeeList();

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "mike", "Smith"));
		emplist.add(new Employee(2, "Gosha", "irle"));
		emplist.add(new Employee(3, "Joshuua", "sarah"));
		emplist.add(new Employee(4, "Soniko", "munkh"));
		emplist.add(new Employee(5, "DOrj", "luva"));
		try {
			FileOutputStream outputstrea = new FileOutputStream("Employee.txt");
			ObjectOutputStream obj = new ObjectOutputStream(outputstrea);
			obj.writeObject(emplist.toString());
			obj.close();
			outputstrea.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void ReadFromEmployeeList() {
		ArrayList<Employee> empRead = new ArrayList<>();
		try (FileInputStream fileinputstream = new FileInputStream("Employee.txt")) {

			ObjectInputStream objread = new ObjectInputStream(fileinputstream);
			

			for (Employee emp : empRead) {
				System.out.println(emp.firstName);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getStackTrace());
		}
	}

}

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String firstName;
	String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}