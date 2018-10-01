package dayEight.Collections;

import java.util.ArrayList;

import java.util.Collections;

public class ComparDemo2 {
	public static void main(String[] args) {
		
		ArrayList<PersonvVersion2> personlist = new ArrayList<>();
		personlist.add(new PersonvVersion2("Henry","Miller","120 main st"));
		personlist.add(new PersonvVersion2("Jeffey","munkh","120 main st"));
		personlist.add(new PersonvVersion2("Sarah","Zorig","120 main st"));
		personlist.add(new PersonvVersion2("Zaya","Pizza","120 main st"));
		personlist.add(new PersonvVersion2("Lovely","Mike","120 main st"));
		personlist.add(new PersonvVersion2("Sugar","Joshua","120 main st"));
		personlist.add(new PersonvVersion2("Kind","Yellow","120 main st"));
		Collections.sort(personlist);
		for (PersonvVersion2 p: personlist) {
			System.out.println(p.fName +" : " + p.lName +" : "+ p.address);
		}
	}
}

class PersonvVersion2 implements Comparable<PersonvVersion2>{
	String fName;
	String lName;
	String address;
	public PersonvVersion2(String fName, String lName, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	@Override
	public int compareTo(PersonvVersion2 o) {
		// TODO Auto-generated method stub
		int last = this.lName.compareTo(o.lName);
		return last ==0 ?this.fName.compareTo(o.fName): last;
	}
}
