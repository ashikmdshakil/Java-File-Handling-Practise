package file;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("E:\\practice.text");
		try {
			if(file.createNewFile()) {
				System.out.println("The file has been creted. And the file name is :"+ file.getName());
			}
			else {
				System.out.println("File already exists !");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File creation error occured");
		}

	}

}
