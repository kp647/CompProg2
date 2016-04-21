package Inheritance_HW;


public class Tester {



			public static void main(String[] args) {
				Employee in = new Employee("kevin",101010,"12/20/2016");
				ProductionWorker worker2 = new ProductionWorker(in, 1,25);
				ShiftSupervisor s1 = new ShiftSupervisor(worker2, 7500, 0);
//
			//Employee in = new Employee("kevin",1,new Date(1,1,2000));
////				ProductionWorker worker1 = new ProductionWorker();
			//ProductionWorker worker2 = new ProductionWorker( in, 1,20);
//				//System.out.println(worker2.getEmployeeNumber()+"name"+worker2.getName()+"HireDate"+worker2.getHireDate()+"shift"+worker2.getShift()+"payrate"+worker2.gethPayRate());
//				System.out.println("name = "+worker2.empInfo.getName());
//				worker2.empInfo.setHireDate("1/1/2016");
//				System.out.println("HireDate = "+worker2.empInfo.getHireDate());
//				System.out.println("shift = "+worker2.getShift());
//				System.out.println("payrate = "+worker2.gethPayRate());
//				System.out.println("ID = "+worker2.empInfo.getEmployeeNumber());
//				//System.out.println(Employee);
				
				
				System.out.println("Name = "+worker2.empInfo.getName());
				//worker2.empInfo.setHireDate("1/1/2016");
				System.out.println("HireDate = "+worker2.empInfo.getHireDate());
				System.out.println("Shift = "+worker2.getShift());
//				System.out.println("payrate = "+worker2.gethPayRate());
				System.out.println("ID = "+worker2.empInfo.getEmployeeNumber());
				System.out.println("Salary = "+s1.getAnuSal());
				System.out.println("PayRate $ "+s1.workInfo.gethPayRate());
			}

		


	}


