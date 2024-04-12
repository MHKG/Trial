import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File filename = new File("C:\\Users\\mehul\\Downloads\\All changes by Mehul, Likhi and Nandan\\Upload\\GL Account, GL Description, Amount.txt");

		try {
			FileInputStream inputStream = new FileInputStream(filename);
			int byteRead;
			while ((byteRead = inputStream.read()) != -1) {
				System.out.print((char) byteRead);
			}
			inputStream.close();
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
