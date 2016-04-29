/**
 * 
 */
package finHw;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Kevin Patel
 *
 *///Exception Handling in this program
public class Runner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

			int choice=0;
			String NaM = null, Date = null;
			int i = 0,j = 0;
			double k = 0;
			Employee w1 = new Employee();
			ProductionWorker p1 = new ProductionWorker();
			Address abb = new Address();//Aggregation
			try {//exception handling****** 2
				
				w1 = new Employee(NaM,i,Date,abb);
			} catch (InvalidEmployeeNumber e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			 try {//exception handling*******2
				p1 = new ProductionWorker(w1,j,k);
			} catch (InvalidShift | InvalidePayRate e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Scanner ch = new Scanner (System.in);
		while (choice!=7){
			showMenu();
			choice= ch.nextInt();
			try{//exception handling******2
		if (choice==1){
			Scanner ein = new Scanner (System.in);

			System.out.println("\nThis part of the program will ask for employee info \n");
			System.out.println("please Enter the Employee Name");
			NaM= ein.nextLine();
			System.out.println("please Enter the Employee ID Number");
			i=ein.nextInt();
			System.out.println("please Enter the Employee Hire Date Format mm/dd/yyyy");
			Date =ein.next();
			System.out.println("please Enter the Employee Shift 0 for day & 1 for night");
			j= ein.nextInt();
			System.out.println("please Enter the PayRate");
			k=ein.nextDouble();
			System.out.println("please Enter the City");
			String cc=ein.nextLine();
			String city=ein.nextLine();
			System.out.println("please Enter the State");
			String state=ein.nextLine();
			System.out.println("please Enter the Zipcode");
			String zipCode=ein.nextLine();
			System.out.println("please Enter the Country");
			String country=ein.nextLine();
			Address a = new Address(city,state,zipCode,country);//aggregation
			
			
				 w1 = new Employee(NaM,i,Date,a);
				 p1 = new ProductionWorker(w1,j,k);
			
			
			
		}
		if (choice ==2){
			
			ConV f = new ConV();
		}
		if (choice ==3){
			
			System.out.println(p1+"\n\n\n");
			
		}
		if (choice ==4){
			Employee e1 = new ProductionWorker(w1,j,k);//polymorphism****
			System.out.println();
			System.out.println(e1);//Overriding employee To string
			System.out.println("This shows Polymorphism is used to display this worker\n\n\n");
		}
		if (choice ==5){
			System.out.println("\n\n\nPlease enter any number you would like to be doubled");
			double nm=ch.nextDouble();
			System.out.println("your Number :"+nm+" is "+Doubler.Dbl(nm)+" when doubled.\n\n\n");
		}
		if (choice == 6){
			System.out.println("\n\n\nThis program will calulate the perimeter of a rectangular pool \n As well as calculate the Maximum Volume Capicity of the pool");
			System.out.println("\nplease enter the length of the pool");
			double len = ch.nextDouble();
			System.out.println("please enter the width of the pool");
			double wid= ch.nextDouble();
			System.out.println("please enter the depth of the pool");
			double hei=ch.nextDouble();
			pool p = new pool(len,wid,hei);
			System.out.println("\nPlease Wait.. Calculating.......Done!");
			System.out.println("\nThe perimeter of the pool is :"+p.getPerimeter()+"\n Your Maximum volume Capicity is :"+p.GetVolume()+"\n\n\n");
			
		}
		}
			catch(InvalidEmployeeNumber e){//Exception Handling
				System.out.println(e.getMessage());
			}
			catch(InvalidShift e){
				System.out.println(e.getMessage());
			}
			catch(InvalidePayRate e){
				System.out.println(e.getMessage());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	private static void showMenu() {
				System.out.println("This is a MultiPurpose Application");
		  		System.out.println(" 1. To Enter hourly worker Info ");
		 		System.out.println(" 2. To Convert Text Line to all Upper Case  ");
		 		System.out.println(" 3. To Display last worker INFO  ");
		 		System.out.println(" 4. To show Employee Info using Polymorphism ");
		 		System.out.println(" 5. To Double any number ");
		 		System.out.println(" 6. To Calculate the permiter and Volume of a Swimming pool ");
		 		System.out.println(" 7. To Quit ");
		 		System.out.println(" ");
		 		System.out.print(" Please enter your choice: ");   
	}
}
		 

		
	


