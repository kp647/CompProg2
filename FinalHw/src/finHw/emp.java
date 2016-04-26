package finHw;

import java.util.Scanner;

public class emp extends Runner {
	public emp(){
		Scanner ein = new Scanner (System.in);
//		String NaM, Date;
//		int i,j;
//		double k;
		System.out.println("This part of the program will ask for employee info");
		System.out.println("please Enter the Employee Name");
		String NaM = ein.nextLine();
		System.out.println("please Enter the Employee ID Number");
		int i = ein.nextInt();
		System.out.println("please Enter the Employee Hire Date Format mm/dd/yyyy");
		String Date = ein.next();
		System.out.println("please Enter the Employee Shift 0 for day & 1 for night");
		int j = ein.nextInt();
		System.out.println("please Enter the PayRate");
		double k = ein.nextDouble();
		
	}

}
