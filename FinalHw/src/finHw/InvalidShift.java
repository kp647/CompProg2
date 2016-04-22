package finHw;

@SuppressWarnings("serial")
public class InvalidShift extends Exception {
	public InvalidShift()
	   {
	      super("Error: Invalid Shift.");
	   }
	   public InvalidShift(int shift)
	   {
	      super("Error: Invalid Shift: " + shift);
	   }

}
