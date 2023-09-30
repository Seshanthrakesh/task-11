//Q5.write code for StringIndexOutOfBondException
 
package Answer;
public class Q5StringIndexOutOfBoundException {
public static void main(String[] args) {
		
				String str ="Rakesh";
				
				//Attempt to access an index that is out of bounds
				try{
					char  outofBounds =str.charAt(15);			//StringIndexOutOfBondException
					System.out.println("Index 15:  "+outofBounds);     					
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("ArrayIndexOutofBound:");
					System.err.println("***No Character is index 15***");
					e.printStackTrace();

				}
				
}		
	}


