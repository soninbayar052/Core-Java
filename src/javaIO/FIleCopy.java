package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FIleCopy {
	public static void main(String[] args) throws IOException{
		FileCopyUsingNIOFiles();
		fileCopyUsingFileChannelClass();
	}

	private static void FileCopyUsingNIOFiles() throws IOException {
		Path source = Paths.get("Demo.txt");
		Path destination = Paths.get("Demo2.txt");
		
		Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);
		
	}
	
	
	private static void fileCopyUsingFileChannelClass() throws IOException{
		File filetoCopy = new File("Demo2.txt");
		FileInputStream fileinputstream = new FileInputStream(filetoCopy);
		FileChannel in = fileinputstream.getChannel();
		
		File newfile = new File("TestCopy.txt");
		FileOutputStream fileoutputstream = new FileOutputStream(newfile);
		FileChannel out = fileoutputstream.getChannel();
		
		in.transferTo(0, filetoCopy.length(), out);
		in.close();
		out.close();
		
		
	}
}
