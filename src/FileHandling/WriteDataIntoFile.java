package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("E:\\dummy/sample.txt");
			fw.write("hi aditya");
			fw.write("are you trying to push the data into file");
			fw.write("ok proceed");
			fw.flush();
			fw.close();
			System.out.println("sucessfully pushed data into file");
		} catch (IOException e) {
			System.out.println("no data has pushed into file");
			e.printStackTrace();
		}
		

	}

}
