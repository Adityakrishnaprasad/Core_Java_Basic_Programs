 package FileHandling;

import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		File f = new File("E:\\dummy/sample.txt");
		boolean read=f.canRead();
		System.out.println(read);
		if(f.exists()==false) {
			try {
				f.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file already created");
		}
	}

}
