package PolyHW;

public class CruiseShip extends Ship{
	private int maxNumOfPass;
	public CruiseShip(){
		super();
		this.maxNumOfPass=0;
		}
	public CruiseShip(int m){
		super();
		this.maxNumOfPass=m;
	}
	public CruiseShip(String n,String y){
		super(n,y);
		this.maxNumOfPass=0;
	}
	public CruiseShip(String n, String y, int m){
		super(n,y);
		this.maxNumOfPass=m;
	}
	public String toString(){
		return "Cruise Ship\n"
				+ " Ship Name: " + getName() + "\n"
				+ " Maximum Number of Passengers " + maxNumOfPass;

	}
	public int getMaxNumOfPass() {
		return maxNumOfPass;
	}
	public void setMaxNumOfPass(int maxNumOfPass) {
		this.maxNumOfPass = maxNumOfPass;
	}

}
