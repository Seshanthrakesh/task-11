/*Q5.a.Write a Code of 5ArrayIndexOutOfBoundException?*/

package Answer;
	public class Q5ArrayIndexOutOfBoundException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
			int [] arr = {3};					//ArrayIndexOutofBoundException
			System.out.println(arr[2]);	//Exception is printed
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("There is No Data in Array Index arr[2]");
				System.err.println("****ArrayindexOutOfBonds****");
				e.printStackTrace();//Print Details of Exception
			}
}
	}
