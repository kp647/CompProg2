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
	private Address add;//used for aggregation
	
	
	public Employee(){
		name= "Not Available";
		employeeNumber=1;
		hireDate= "";
		add = null;
	}
	public Employee(String name, int employeeNumber, String hireDate,Address addd) throws InvalidEmployeeNumber{
		this.name = name;
		if(employeeNumber<0)
			 throw new InvalidEmployeeNumber(employeeNumber);
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
		add=addd;
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
	public String toString(){
		return "Worker\n"
				+ " Employee Name: " + getName() + "\n"
				+ " Employee ID is: " + getEmployeeNumber() + "\n"
				+ " HireDate is: " + getHireDate() + "\n"
				+ " Employee address is " +add.toString();
				
	}
	

}