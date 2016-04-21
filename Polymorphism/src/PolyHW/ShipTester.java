package PolyHW;

public class ShipTester {

	public static void main(String[] args) {
		
		Ship[] ships = new Ship[15];
		
		for (int x = 0; x<= 14;x++)
		{
			if (x<5)
				ships[x] = new CargoShip("Ship "+x,"2001",x*5);
			else if (x<10)
				ships[x]= new CruiseShip("Ship "+x,"2016",x*250);
			else
				ships[x]= new Ship("Ship "+x,"19"+x);
			
			
			System.out.println(ships[x].toString());
			System.out.println();
		}
		

	}

}

