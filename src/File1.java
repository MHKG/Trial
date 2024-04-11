import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {

		// Get the filename from the command line argument
		File filename = new File("C:\\Users\\mehul\\Downloads\\All changes by Mehul, Likhi and Nandan\\Book1.xlsx");

		try {
			// Create a FileInputStream for the specified file
			FileInputStream inputStream = new FileInputStream(filename);

			// Read bytes from the file and process them
			int byteRead;
			while ((byteRead = inputStream.read()) != -1) {
				// Process each byte as needed
				System.out.print((char) byteRead); // Print each byte as a character
			}

			// Close the input stream
			inputStream.close();
		} catch (IOException e) {
			// Handle any IOException that might occur
			System.out.println("Error reading file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
