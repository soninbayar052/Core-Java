package javaIO;

import java.io.File;
import java.io.IOException;

public class CreateReadOnlyFile {

	public static void main(String[] args) {
		try {
			File file = new File("FIleDemoChanged.txt");
			
			CreateReadOnlyFIle();
			file.setWritable(true); // set write able again brother
			File newFIle =new File("Demo.txt");
			file.renameTo(newFIle);
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	// this method will file in read only file

	private static void CreateReadOnlyFIle() throws IOException {
		File file = new File("Demo.txt");
	

		if (file.exists()) {
			file.setReadOnly();
		
		}
	}

}
