package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Shopping {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("D://CDAC//Java_Assignment//Assignment_9//Sample.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			Shopping emp = (Shopping) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}