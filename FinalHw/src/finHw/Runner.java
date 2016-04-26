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
			try {
				w1 = new Employee(NaM,i,Date);
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
		while (choice!=5){
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
			
			//try {
				 w1 = new Employee(NaM,i,Date);
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
			FileWrite c = new FileWrite();
			
		}
		if (choice ==3){
			
			System.out.println(p1.toString());
			
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
		  		System.out.println(" 1. Enter hourly worker Info ");
		 		System.out.println(" 2. Get Secret Message ");
		 		System.out.println(" 3. Display last worker INFO  ");
		 		System.out.println(" 4. Use Division ");
		 		System.out.println(" 5. To Quit ");
		 		System.out.println(" ");
		 		System.out.print(" Please enter your choice: ");   
	}
}
		 

		
	


