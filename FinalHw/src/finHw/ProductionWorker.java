package finHw;


public class ProductionWorker extends Employee {
	private int shift;
	private double hPayRate;
	Employee empInfo;
	Address add;
	public ProductionWorker(){
		super();//ask tomorrow
		this.shift=1;
		this.hPayRate=10;	
	}
	public ProductionWorker(Employee empInfo,int shift) throws InvalidShift{
		if (shift<0||shift>1)
			throw new InvalidShift(shift);
		this.shift=shift;
		this.empInfo=empInfo;
	}
	public ProductionWorker(String name,int employeeNumber,String hireDate,Address addd,int shift, double hPayRate) throws InvalidShift, InvalidePayRate, InvalidEmployeeNumber{
		super(name,employeeNumber,hireDate,addd);
		if (shift<0||shift>1)
			throw new InvalidShift(shift);
		
		this.shift=shift;
		if(hPayRate<0)
		throw new InvalidePayRate(hPayRate);
		this.hPayRate=hPayRate;
		this.empInfo=empInfo;
	}
	public ProductionWorker(Employee empInfo,int shift, double hPayRate) throws InvalidShift, InvalidePayRate{
		//super(name,employeeNumber,hireDate);
		if (shift<0||shift>1)
			throw new InvalidShift(shift);
		
		this.shift=shift;
		if(hPayRate<0)
		throw new InvalidePayRate(hPayRate);
		this.hPayRate=hPayRate;
		this.empInfo=empInfo;
	}

	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public double gethPayRate() {
		return hPayRate;
	}
	public void sethPayRate(double hPayRate) {
		this.hPayRate = hPayRate;
	}
//	public String toString(){
//		return "Worker\n"
//				+ " Employee Name: " + empInfo.getName() + "\n"
//				+ " Employee ID is: " + empInfo.getEmployeeNumber() + "\n"
//				+ " HireDate is: " + empInfo.getHireDate() + "\n"
//				+ " PayRate is: " + gethPayRate() + "\n"
//				+ " The Shift is: " + getShift() +"\n\n\n"
//				+ empInfo.toString();
//	}
	public String toString(){
		return "\n"
				+ empInfo.toString()+"\n"
				+ " PayRate is: " + gethPayRate() + "\n"
				+ " The Shift is: " + getShift(); //+"\n\n\n"
				//+ empInfo.toString();
	}
}