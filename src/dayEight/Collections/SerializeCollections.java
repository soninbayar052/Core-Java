package dayEight.Collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class SerializeCollections {
	public static void main(String[] args) throws IOException {
		HashSet<String> hash = new HashSet<>();
		hash.add("ALex");
		hash.add("Brian");
		hash.add("Charlie");

		System.out.println(hash);

		try {
			FileOutputStream outputStream = new FileOutputStream("Namelist.txt");
			ObjectOutputStream object = new ObjectOutputStream(outputStream);
			object.writeObject(hash.toString());
			outputStream.close();
			object.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
