
package Answer;
public class Q7AgeInvalidException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Person Age : 17");
			ThrowsEXception.throwAgeInvalidEXception(17);
		}

	}
	 class ThrowsEXception{							//creation of Custom Exception
		static void throwAgeInvalidEXception(int age) 
		{
			try {
			if(age<=18)
			{
				throw new Exception("ERROR:******age Must be Greater than 18*****");
				//throw new AgeInvalidException("age is greater than 18");
				//System.out.println("*****AgeInvalidEXception*****");
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println("ERROR:######age is greater than 18######");
			}
			
		}
		
	}

