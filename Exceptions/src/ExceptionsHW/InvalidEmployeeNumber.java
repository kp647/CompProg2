package ExceptionsHW;

@SuppressWarnings("serial")
public class InvalidEmployeeNumber extends Exception {
	public InvalidEmployeeNumber()
	   {
	      super("Error: Invalid Employee Number.");
	   }
	   public InvalidEmployeeNumber(int employeeNumber)
	   {
	      super("Error: Invalid Employee Number: " + employeeNumber);
	   }

}
