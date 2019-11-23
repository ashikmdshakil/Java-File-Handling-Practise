package fileHandling;

import java.io.File;

public class DeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\practice.text");
		if(file.delete()) {
			System.out.println("the file " +file.getName()+ " has been deleted");
		}

	}

}
