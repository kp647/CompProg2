/**
 * 
 */
package finHw;

/**
 * @author College
 *
 */
@SuppressWarnings("serial")
public class InvalidePayRate extends Exception {
	public InvalidePayRate()
	   {
	      super("Error: Invalid Pay Rate.");
	   }
	   public InvalidePayRate(double hPayRate)
	   {
	      super("Error: Negative Pay Rate is Invalid: " + hPayRate);
	   }
	

}
