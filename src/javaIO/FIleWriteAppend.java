package javaIO;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleWriteAppend {

	public static void main(String[] args) {

		try {
			usingPrinterWriter();
			usingFIleOutputString();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	public static void usingPrinterWriter() throws IOException {
		String text = "Using Printer Writer class";
		FileWriter filewriter = new FileWriter("Demo.txt", true);
		PrintWriter printwriter = new PrintWriter(filewriter);
		printwriter.println(text);
		printwriter.close();
	}
	
	public static void usingFIleOutputString() throws IOException {
		String stri = "File Output Stream String class";
		FileOutputStream fileoutput = new FileOutputStream("Demo.txt", true);
		byte[] strToByte = stri.getBytes();
		fileoutput.write(strToByte);
		fileoutput.close();
	}
}
