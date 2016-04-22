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
//		Scanner in = new Scanner (System.in);
//		int choice =0;
//		System.out.println("HireDate = "+p1.empInfo.getHireDate());
//		conditions();
//		
//		}
//		
//
//	
//
//	public static void conditions() throws IOException {
			int choice=0;
			Scanner ch = new Scanner (System.in);
		while (choice!=5){
			showMenu();
			choice= ch.nextInt();
		if (choice==1){
			Scanner ein = new Scanner (System.in);
			String NaM, Date;
			int i,j;
			double k;
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
			try {
				Employee w1 = new Employee(NaM,i,Date);
				ProductionWorker p1 = new ProductionWorker(w1,j,k);
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
		if (choice ==2){
			FileWrite c = new FileWrite();
			
		}
		if (choice ==3){
			Employee w1=null;
			ProductionWorker p1=null ;
			System.out.println("Name = "+ w1.getName());
			System.out.println("ID = "+p1.getEmployeeNumber());
			System.out.println("HireDate = "+p1.getHireDate());
			System.out.println("PayRate $ "+p1.gethPayRate());
			System.out.println("Shift = "+p1.getShift());
			
		}
		}
		
		
	}

	private static void showMenu() {
		  		System.out.println(" 1. Enter hourly worker Info ");
		 		System.out.println(" 2. Get Secret Message ");
		 		System.out.println(" 3. Display last worker INFO  ");
		 		System.out.println(" 4. Use Division ");
		 		System.out.println(" 5. To Quit ");
		 		System.out.println(" ");
		 		System.out.print(" Please enter your choice: ");   
	}
}
		 

		
	


