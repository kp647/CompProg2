/**
 * 
 */
package finHw;



/**
 * @author College
 *
 */
public class Employee {
	private String name;
	private int employeeNumber; 
	private String hireDate;

	
	
	public Employee(){
		name= "Not Available";
		employeeNumber=-1;
		hireDate= "";	
	}
	public Employee(String name, int employeeNumber, String hireDate) throws InvalidEmployeeNumber{
		this.name = name;
		if(employeeNumber<0)
			 throw new InvalidEmployeeNumber(employeeNumber);
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	

}