package p1_basic_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data1.txt"));
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			System.out.println("A FileNotFoundException occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An IO Exception occurred.");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
