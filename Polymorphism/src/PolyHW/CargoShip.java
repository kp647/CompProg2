package PolyHW;

public class CargoShip extends Ship{
	private int capacity;
	public CargoShip(){
	super();
	capacity=0;
	}
	public CargoShip(int c){
		super();
		this.capacity=c;
	}
	public CargoShip(String n, String y){
		super(n,y);
		this.capacity=0;
			
	}
	public CargoShip(String n,String y,int c){
		super(n,y);
		this.capacity=c;
	}
	public String toString(){
		return "Cargo Ship\n"
				+ " Ship Name: " + getName() + "\n"
				+ " Maximum Capacity " + capacity +"  Tonnage";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}
