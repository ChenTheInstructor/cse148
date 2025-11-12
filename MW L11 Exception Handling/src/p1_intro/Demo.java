package p1_intro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args)  {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String s = scanner.nextLine();
//
//		try {
//			int n = Integer.parseInt(s);
//			System.out.println("The integer is: " + (n * 2));
//		} catch (ArithmeticException en) {
//			System.out.println(en.getMessage());
//			en.printStackTrace();
//		}
//
//		System.out.println("End of the program!");
//	}
		BufferedReader br = null;
		try {
			double total = 0.0;
			FileReader fr = new FileReader("data1.txt");
			br = new BufferedReader(fr);
			String line;
			int count = 0;
			while((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				total += Double.parseDouble(arr[2]);
				count++;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("The reading and parsing are finished!");
			System.out.printf("The average GPA: %.2f%n", (total / count));
			System.out.println("Total Students: " + count);
			return;
//			br.close();
//			String line1 = br.readLine();
//			System.out.println(line1);
//			String[] arr = line1.split(" ");
////			System.out.println("The GPA is: " + (Double.parseDouble(arr[2]) + 1.0));
//			PartTimeStudent pt1 = new PartTimeStudent(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]);
//			theBag.insert(pt1);
		} catch (FileNotFoundException e) {
			System.out.println("Something wrong!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Finally is running!");
		}
		System.out.println("The end!");

	}
}
