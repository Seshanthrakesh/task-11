/*Q8.Implement Exception handling in Java program that reads the data from the file . if the data does not Exists throw "FileNotFound
 * Exception" and Display the Error Message to the User 
 * 
 */
package Answer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8FileHasNotFoundEXception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Throws FileHasNotFoundException: "); 
		try {
	File file = new File("C:\\Users\\Seshu-PC\\guvigit\\learning_java\\Hello.txt");
		Scanner sc = new Scanner(file);
		sc.close();
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		System.err.println("*****FILE IS NOT FOUND******");
		}
		
	}

}