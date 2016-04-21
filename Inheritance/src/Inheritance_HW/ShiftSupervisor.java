package Inheritance_HW;



public class ShiftSupervisor extends Employee {
	private double anuSal;
	private double anuProBo;
	ProductionWorker workInfo;
	public ShiftSupervisor(){	
	}
	public ShiftSupervisor(ProductionWorker workIn , double anuSal, double anuProBo){
		this.anuSal=anuSal;
		this.anuProBo=anuProBo;
		this.workInfo=workIn;
	}
	public double getAnuSal() {
		return anuSal;
	}
	public void setAnuSal(double anuSal) {
		this.anuSal = anuSal;
	}
	public double getAnuProBo() {
		return anuProBo;
	}
	public void setAnuProBo(double anuProBo) {
		this.anuProBo = anuProBo;
	}
}
	
