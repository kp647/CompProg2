package finHw;
//subclass
//Kevin
public class ProductionWorker extends Employee {//Inheritance
	private int shift;
	private double hPayRate;
	Employee empInfo;
	Address add;
	public ProductionWorker(){
		super();
		this.shift=1;
		this.hPayRate=10;	
	}
	public ProductionWorker(Employee empInfo,int shift) throws InvalidShift{//method Overloading
		if (shift<0||shift>1)
			throw new InvalidShift(shift);//exception handling
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

	public int getShift() {//accessor
		return shift;
	}
	public void setShift(int shift) {//mutator
		this.shift = shift;
	}
	public double gethPayRate() {//accessor
		return hPayRate;
	}
	public void sethPayRate(double hPayRate) {//mutator
		this.hPayRate = hPayRate;
	}

	public String toString(){//toString---method overriding
		return "\n"
				+ empInfo.toString()+"\n"
				+ " PayRate is: " + gethPayRate() + "\n"
				+ " The Shift is: " + getShift(); //+"\n\n\n"
				
	}
}