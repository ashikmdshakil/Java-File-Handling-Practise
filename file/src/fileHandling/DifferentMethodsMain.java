package fileHandling;

import java.io.File;

public class DifferentMethodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\practice.text");
		if(file.exists()) {
			
			System.out.println("File name is :"+ file.getName());
			System.out.println("File path is :"+ file.getAbsolutePath());
			System.out.println("File Size is :"+ file.length());
		}

	}

}
