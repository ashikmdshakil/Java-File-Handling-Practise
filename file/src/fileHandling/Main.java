package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer =  new FileWriter("E:\\practice.text");
			writer.write("HEllo ! My name is Ashik Muhammad Shakil. I have started learning Java file handling. Soon I am gonna master on it.");
			writer.close();
			System.out.println("Wrote successfully !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("I/O error occured.");
		}

	}

}
