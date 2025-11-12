package p1_basic_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("data1.txt"))) {
			System.out.println(br.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
