package p1_intro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DemoTryWithResources {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("data/data1.txt"); 
				BufferedReader br = new BufferedReader(fr);) {

			double total = 0.0;

			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				total += Double.parseDouble(arr[2]);
				count++;
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println("The reading and parsing are finished!");
			System.out.printf("The average GPA: %.2f%n", (total / count));
			System.out.println("Total Students: " + count);
		} catch (FileNotFoundException e) {
			System.out.println("Something wrong!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The end!");

	}
}
