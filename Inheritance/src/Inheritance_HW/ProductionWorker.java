package Inheritance_HW;




public class ProductionWorker extends Employee {
	private int shift;
	private double hPayRate;
	Employee empInfo;
	public ProductionWorker(){
		super();
		this.shift=1;
		this.hPayRate=10;	
	}
	public ProductionWorker(Employee empInfo,int shift){
		this.shift=shift;
		
		this.empInfo=empInfo;
	}
	public ProductionWorker(Employee empInfo,int shift, int hPayRate){
		//super(name,employeeNumber,hireDate);
		this.shift=shift;
		this.hPayRate=hPayRate;
		this.empInfo=empInfo;
	}
//	public ProductionWorker(String name, int employeeNumber,Date hireDate,int shift, int hPayRate){
//		//super(name,employeeNumber,hireDate);
//		this.shift=shift;
//		this.hPayRate=hPayRate;
//		personal comments
//	}
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
	
	
	
	
}
