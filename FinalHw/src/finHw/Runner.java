/**
 * 
 */
package finHw;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Kevin Patel
 *
 */
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
			Address abb = new Address();
			try {
				//abb = new Address(ct,sta,zi,cnt);
				w1 = new Employee(NaM,i,Date,abb);
			} catch (InvalidEmployeeNumber e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			 try {
				p1 = new ProductionWorker(w1,j,k);
			} catch (InvalidShift | InvalidePayRate e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Scanner ch = new Scanner (System.in);
		while (choice!=7){
			showMenu();
			choice= ch.nextInt();
			try{
		if (choice==1){
			Scanner ein = new Scanner (System.in);

			System.out.println("This part of the program will ask for employee info");
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
			Address a = new Address(city,state,zipCode,country);
			
			//try {
				 w1 = new Employee(NaM,i,Date,a);
				 p1 = new ProductionWorker(w1,j,k);
			//}
//			catch(InvalidEmployeeNumber e){
//				System.out.println(e.getMessage());
//			}
//			catch(InvalidShift e){
//				System.out.println(e.getMessage());
//			}
//			catch(InvalidePayRate e){
//				System.out.println(e.getMessage());
//			}
//			catch(Exception e){
//				System.out.println(e.getMessage());
//			}
			
			
		}
		if (choice ==2){
			
			ConV f = new ConV();
		}
		if (choice ==3){
			
			System.out.println(p1);
			
		}
		if (choice ==4){
			Employee e1 = new ProductionWorker(w1,j,k);//polymorphism
			System.out.println(e1);//Overriding super To string
			System.out.println("This shows Polymorphism is present in the code");
		}
		}
			catch(InvalidEmployeeNumber e){
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
		  		System.out.println(" 1. Enter hourly worker Info ");
		 		System.out.println(" 2. Convert Text Line to all Upper Case  ");
		 		System.out.println(" 3. Display last worker INFO  ");
		 		System.out.println(" 4. To show Employee Info using Polymorphism ");
		 		System.out.println(" 5. To Quit ");
		 		System.out.println(" ");
		 		System.out.print(" Please enter your choice: ");   
	}
}
		 

		
	


