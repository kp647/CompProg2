/**
 * 
 */
package finHw;



/**
 * @author College
 *
 */
public class Employee {//super class 3.A
	private String name;
	private int employeeNumber; 
	private String hireDate;
	private Address add;//used for aggregation 3.H
	
	
	public Employee(){//method Overloading
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
	public String getName() {//accessor
		return name;
	}
	
	public void setName(String name) {//mutator
		this.name = name;
	}
	public int getEmployeeNumber() {//accessor
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {//mutator
		this.employeeNumber = employeeNumber;
	}
	public String getHireDate() {//accessor
		return hireDate;
	}
	public void setHireDate(String hireDate) {//mutator
		this.hireDate = hireDate;
	}
	public String toString(){//3.e overided by production worker toString-toString
		return "Worker\n"
				+ " Employee Name: " + getName() + "\n"
				+ " Employee ID is: " + getEmployeeNumber() + "\n"
				+ " HireDate is: " + getHireDate() + "\n"
				+ " Employee address is " +add.toString();
				
	}
	

}