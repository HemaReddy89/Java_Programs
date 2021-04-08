import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileCreation {

	public static void main(String[] args) {
		  try {
			  FileWriter myObj = new FileWriter("/Users/hemareddy/eclipse-workspace/Hello World Project/filename2.txt");
		      myObj.write("Files in Java might be tricky, but it is fun enough!");
		      myObj.close();
		      System.out.println("Successfully wrote to the file.");
//		      if (myObj.createNewFile()) {
//		        System.out.println("File created: " + myObj.);
//		      } else {
//		        System.out.println("File already exists.");
//		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
