package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FiletoWrtie {
	
	public static void main(String[] args) {
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter("Demo.txt"))){
		
			
			String []arr= {"Say","Hi","Brother","World"};
			
			for(String str: arr) {
				buffer.write(str);
				buffer.newLine();
			}
		
		} catch(IOException e) {
			System.out.println("IO EXCEPTION" + e.getMessage());
		}
	}

}
