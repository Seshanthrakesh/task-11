/*Q4.Write a java that reads the user input for two integer and perform division.and handle Exception that Thrown when the second 
number is divide by Zero and the error message to the user*/

package Answer;
import java.util.Scanner;
public class Q4ArithmeticException {
	public static void main(String[] args) {
	System.out.print("Enter the first number: ");//User input -->10
	Scanner s= new Scanner(System.in);
	int num1=s.nextInt();
	s.close();
	int num2=0;
	System.out.println("second number as zero: "+num2);//Second number is Zero
	try
	{
		int num=num1/num2;//Division by second as zero
		System.out.println("Number1 / Number2 :"+num);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.err.println("Number Can't be Divide by Zero" );//Error message printed
		e.printStackTrace(); 
	}
	finally {
		
	}
}
}