package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import p1_text_io.StudentBag;

public class BackupRestoreHandler {
	public static void backup(StudentBag theBag) {
		try {
			FileOutputStream fos = new FileOutputStream("backup/studentBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(theBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static StudentBag restore() {
		try {
			FileInputStream fis = new FileInputStream("backup/studentBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			StudentBag theBag = (StudentBag)(ois.readObject());
			
			
			ois.close();
			return theBag;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
