package PolyHW;

public class Ship {
	private String name;
	private String yearBuilt;
	public Ship(){
		name ="NO Name";
		yearBuilt="Unknown";
			}
	public Ship(String n, String y){
		this.name=n;
		this.yearBuilt=y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String toString(){
		return "Ship\n"
				+ " Ship Name: " + name + "\n"
				+ " Built in " + yearBuilt;

		
	}

}
